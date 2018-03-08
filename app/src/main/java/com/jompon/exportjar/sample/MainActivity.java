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

package com.jompon.exportjar.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.jompon.exportjar.TestJar;

/**
 * This will show using lib class by copy jar file to /libs/mylib.jar
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtView;
    private TextView txtView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindingView();
        bindingData();
    }

    private void bindingView( )
    {
        txtView = (TextView) findViewById(R.id.txt);
        txtView2 = (TextView) findViewById(R.id.txt2);
    }

    private void bindingData( )
    {
        TestJar testJar = new TestJar("CONSTRUCTOR");
        TestJar testJar2 = new TestJar();
        testJar2.setTest("VALUE");

        Log.d(TAG, testJar.getTest()+"");
        Log.d(TAG, testJar2.getTest()+"");

        txtView.setText(testJar.getTest());
        txtView2.setText(testJar2.getTest());
    }
}
