package com.example.drycleaningapp.presentation.info

import android.os.Build
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dry cleaning app created by Viktor Palagniuk.\n" +
                "Version " + Build.VERSION.RELEASE.toString()
    }
    val text: LiveData<String> = _text
}