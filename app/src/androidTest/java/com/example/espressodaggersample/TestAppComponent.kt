package com.example.espressodaggersample

import com.example.espressodaggersample.di.AppComponent
import com.example.espressodaggersample.di.AppModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class])
interface TestAppComponent: AppComponent {
    fun inject(target: MainActivityTest)
}