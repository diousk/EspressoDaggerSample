package com.example.espressodaggersample

import dagger.Module
import dagger.Provides

@Module
class MockModule {
    @Provides
    fun provideApp(testApp: TestApp): App {
        return testApp
    }
}