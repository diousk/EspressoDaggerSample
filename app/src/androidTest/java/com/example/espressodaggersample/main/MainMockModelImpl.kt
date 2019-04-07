package com.example.espressodaggersample.main

import com.example.espressodaggersample.main.MainModel

class MainMockModelImpl: MainModel {
    override fun getDisplayText(): String {
        return "from test"
    }
}