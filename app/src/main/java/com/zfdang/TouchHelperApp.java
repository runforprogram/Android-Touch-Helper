package com.zfdang;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.util.Log;

public class TouchHelperApp extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public TouchHelperApp() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TouchHelperApp.context = getApplicationContext();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.d("TouchHelperApp", "onLowMemory");
    }

    @Override
    public void onTerminate() {
        Log.d("TouchHelperApp", "onTerminate");
        super.onTerminate();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.d("TouchHelperApp", "onTrimMemory"+level);
        super.onTrimMemory(level);
    }

    public static Context getAppContext() {
        return context;
    }
}
