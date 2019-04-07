package com.example.espressodaggersample.main

import androidx.lifecycle.ViewModel
import com.example.espressodaggersample.di.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class MainModule {
    @Provides
    fun provideMainView(activity: MainActivity): MainView {
        return activity
    }

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(view: MainView): ViewModel {
        return MainViewModel(view)
    }
}