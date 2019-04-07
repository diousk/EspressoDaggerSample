package com.example.espressodaggersample.main

interface MainModel {
    fun getDisplayText(): String
}


class MainModelImpl: MainModel {
    override fun getDisplayText(): String {
        return "from app"
    }
}