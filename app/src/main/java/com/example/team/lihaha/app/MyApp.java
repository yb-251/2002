package com.example.team.lihaha.app;

import android.app.Application;

public class MyApp extends Application {
    public static MyApp app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
