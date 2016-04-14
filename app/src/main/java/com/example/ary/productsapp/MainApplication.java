package com.example.ary.productsapp;

import android.support.multidex.MultiDexApplication;

/**
 * Created by AMoreira on 4/13/16.
 */
public class MainApplication extends MultiDexApplication {

    private static MainApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        setMainApplication(MainApplication.this);
    }

    private static void  setMainApplication(MainApplication mainApplication) {
        mInstance = mainApplication;
    }

    public MainApplication getMainApplication() {
        return mInstance;
    }
}
