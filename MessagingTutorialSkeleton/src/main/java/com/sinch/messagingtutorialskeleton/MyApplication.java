package com.sinch.messagingtutorialskeleton;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Sola_MBP on 7/28/15.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "-", "-");
    }
}
