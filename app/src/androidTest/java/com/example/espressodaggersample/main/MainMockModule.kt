package com.example.espressodaggersample.main

import androidx.lifecycle.ViewModel
import com.example.espressodaggersample.di.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


@Module
class MainMockModule {
    @Provides
    fun provideMainView(activity: MainActivity): MainView {
        return activity
    }

    @Provides
    fun provideMainModel(): MainModel {
        return MainMockModelImpl() // <-- here we replace with mock one
    }

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(view: MainView, model: MainModel): ViewModel {
        return MainViewModel(view, model)
    }
}