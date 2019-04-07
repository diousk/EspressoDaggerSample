package com.example.espressodaggersample

import com.example.espressodaggersample.di.AppComponent
import com.example.espressodaggersample.di.AppModule
import com.example.espressodaggersample.di.ViewModelBuilder
import com.example.espressodaggersample.main.MainActivityTest
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class, ViewModelBuilder::class,
    AppModule::class, MockActivityBuilder::class, MockModule::class])
interface TestAppComponent: AppComponent{
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: TestApp): Builder

        fun build(): TestAppComponent

    }
    fun inject(target: MainActivityTest)
}