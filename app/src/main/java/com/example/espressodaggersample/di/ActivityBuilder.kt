package com.example.espressodaggersample.di

import com.example.espressodaggersample.main.MainActivity
import com.example.espressodaggersample.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun bindMainActivity(): MainActivity
}