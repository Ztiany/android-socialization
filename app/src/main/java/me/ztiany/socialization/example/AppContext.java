package me.ztiany.socialization.example;

import android.app.Application;

public class AppContext extends Application {

    private static AppContext sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }

    public static AppContext getAppContext() {
        return sAppContext;
    }

}
