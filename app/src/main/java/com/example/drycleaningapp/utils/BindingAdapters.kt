package com.example.drycleaningapp.utils

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter

@SuppressLint("SetTextI18n")
@BindingAdapter("app:setTextWithNumberSymbol")
fun TextView.setTextWithNumberSymbol(text: String) {
    this.text = "№$text"
}

@SuppressLint("SetTextI18n")
@BindingAdapter("app:setTextWithDollarSymbol")
fun TextView.setTextWithDollar(text: String) {
    this.text = "$text$"
}