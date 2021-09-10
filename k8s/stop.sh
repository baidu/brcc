#! /bin/bash
kubectl delete -f brcc-server.yaml
kubectl delete -f brcc-config.yaml
kubectl delete -f brcc-service.yaml
kubectl delete -f brcc-namespace.yaml

