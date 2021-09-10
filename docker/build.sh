#! /bin/bash

script=$0
if [ "${script:0:1}" == "/" ]; then
    # shellcheck disable=SC2006
    workspace=`dirname "$script"`/..
else
    # shellcheck disable=SC2006
    workspace=`pwd`/`dirname "$script"`/..
fi

echo workspace="${workspace}"

# shellcheck disable=SC2164
cd "${workspace}"

if [ $? -ne 0 ]; then
    echo "build error, quit"
    exit 1
fi

# reinstall jar
mvn -e clean install -Dmaven.test.skip=true

# shellcheck disable=SC2006
ver="v1.0.0"

# shellcheck disable=SC2034
modules_using_template=(
brcc-server
)
if [[ ${1} != '' ]]; then
    modules_using_template=($1)
fi

# shellcheck disable=SC2128
echo "modules_using_template=${modules_using_template}"

# shellcheck disable=SC2068
for module_path in ${modules_using_template[@]}
do

    echo module_path="${module_path}"
    module=${module_path##*/}
    echo module="${module}"

    mkdir -p output/"${module}"/lib
    mkdir -p output/"${module}"/bin

    cp "${module_path}"/target/*.jar output/"${module}"/lib
    if [ $? -eq 0 ]; then
      echo "copy jar from ${module_path}/target/ to output/${module}/lib succeed"
    else
      echo "copy jar from ${module_path}/target/ to output/${module}/lib failed"
    fi
    # shellcheck disable=SC2086
    cp -f docker/start.sh output/${module}/bin
    # shellcheck disable=SC2086
    sed -i '' "s/app_name_need_to_be_defined/${module}/g" output/${module}/bin/start.sh

    docker build -f "${workspace}"/docker/Dockerfile \
                 -t "${module}":"${ver}" \
                 --build-arg module="${module}" \
                 "${workspace}"/output

    docker tag ${module}:${ver} fkzhao/${module}:${ver}
    docker push fkzhao/${module}:${ver}
done