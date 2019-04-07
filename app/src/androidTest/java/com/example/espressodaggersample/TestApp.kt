package com.example.espressodaggersample

import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class TestApp: App() {
    override fun onCreate() {
        super.onCreate()
        Log.d("TestAPP", "onCreate")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerTestAppComponent.builder().application(this).build()
    }
}