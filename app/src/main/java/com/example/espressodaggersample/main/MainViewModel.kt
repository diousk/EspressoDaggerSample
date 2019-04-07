package com.example.espressodaggersample.main

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val view: MainView
): ViewModel() {

    fun textClick() {
        view.onTextClick()
    }
}