package com.example.espressodaggersample.main

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val view: MainView,
    private val model: MainModel
): ViewModel() {

    fun textClick() {
        view.onTextClick(model.getDisplayText())
    }
}