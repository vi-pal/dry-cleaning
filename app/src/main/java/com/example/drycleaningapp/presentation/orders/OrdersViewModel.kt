package com.example.drycleaningapp.presentation.orders

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.drycleaningapp.db.CleaningDatabase

class OrdersViewModel() : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is offers Fragment"
    }
    val text: LiveData<String> = _text

    init {
        val orderDao = CleaningDatabase.getDatabase().orderDao()
    }
}