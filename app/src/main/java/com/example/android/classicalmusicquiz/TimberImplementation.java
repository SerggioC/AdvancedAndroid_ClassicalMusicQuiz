package com.example.android.classicalmusicquiz;

import timber.log.Timber;

/**
 * Created by Sergio on 25/03/2018.
 */

public class TimberImplementation {
    public static void init() {
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return String.format("Sergio> %s; Method %s; Line %s",
                        super.createStackElementTag(element),
                        element.getMethodName(),
                        element.getLineNumber());
            }
        });
    }


}