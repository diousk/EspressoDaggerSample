package com.example.espressodaggersample

import com.example.espressodaggersample.main.MainActivity
import com.example.espressodaggersample.main.MainMockModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MockActivityBuilder {
    @ContributesAndroidInjector(modules = [MainMockModule::class])
    abstract fun bindMainActivity(): MainActivity
}