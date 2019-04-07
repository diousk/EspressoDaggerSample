package com.example.espressodaggersample

import android.util.Log
import com.example.espressodaggersample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App: DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
        Log.d("APP", "onCreate")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}