/*
 * Copyright (C) 2018 jompons.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jompon.exportjar;

/**
 * This will show sample create class lib
 * and export class to jar file to /release/mylib.jar
 */
public class TestJar {

    private String test;
    public TestJar( ) { }

    public TestJar(String test)
    {
        this.test = test;
    }

    public String getTest( )
    {
        return test;
    }

    public void setTest(String test)
    {
        this.test = test;
    }
}
