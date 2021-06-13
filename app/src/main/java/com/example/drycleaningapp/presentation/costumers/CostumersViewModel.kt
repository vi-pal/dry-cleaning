package com.example.drycleaningapp.presentation.costumers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CostumersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is costumers Fragment"
    }
    val text: LiveData<String> = _text
}