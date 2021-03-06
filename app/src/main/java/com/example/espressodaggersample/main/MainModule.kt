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
    fun provideMainModel(): MainModel {
        return MainModelImpl()
    }

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(view: MainView, model: MainModel): ViewModel {
        return MainViewModel(view, model)
    }
}