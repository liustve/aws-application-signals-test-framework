/*
 * Copyright Amazon.com, Inc. or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.aoc.fileconfigs;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PredefinedExpectedTemplateTest {
    @Test
    public void ensureTemplatesAreExisting() throws Exception {
        for (PredefinedExpectedTemplate predefinedExpectedTemplate :
                PredefinedExpectedTemplate.values()) {
            URL path = predefinedExpectedTemplate.getPath();
            assertNotNull(path);
            // also check if tostring can return a valid filepath
            IOUtils.toString(new URL(path.toString()));
        }
    }
}
