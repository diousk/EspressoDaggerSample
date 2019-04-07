package com.example.espressodaggersample.main

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.espressodaggersample.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {

    @Inject lateinit var prefs: SharedPreferences
    @Inject lateinit var vmf: ViewModelProvider.Factory

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, vmf).get(MainViewModel::class.java)

        helloText.setOnClickListener {
            Log.d("MAIN", "helloText click")
            viewModel.textClick()
        }
    }

    override fun onTextClick() {
        Log.d("MAIN", "change text to clicked")
        helloText.text = "clicked"
    }
}
