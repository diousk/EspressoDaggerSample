package com.example.espressodaggersample.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.espressodaggersample.App
import dagger.Module
import dagger.Provides
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: App): Context {
        return app.applicationContext
    }

    @Provides
    fun providePrefs(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}