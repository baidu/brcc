/*
 * Copyright (c) Baidu Inc. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.brcc.utils.convert;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

public class PropertiesUtil {
    public static String toString(Properties properties,  String groupName) throws IOException {
        StringWriter writer = new StringWriter();
        properties.store(writer, null);
        StringBuffer stringBuffer = writer.getBuffer();
        filterPropertiesComment(stringBuffer, groupName);
        return stringBuffer.toString();
    }
    static boolean filterPropertiesComment(StringBuffer stringBuffer,  String groupName) {
        // check whether has comment in the first line
        if (stringBuffer.charAt(0) != '#') {
            return false;
       }
        int commentLineIndex = stringBuffer.indexOf("\n");
        if (commentLineIndex == -1) {
            return false;
        }
        stringBuffer.delete(0, commentLineIndex + 1);
        stringBuffer.insert(0, "#*"+groupName+"\n");
        return true;
    }
}
