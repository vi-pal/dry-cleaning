package com.example.drycleaningapp.utils

import android.content.Context
import android.database.Cursor
import android.widget.Toast


fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Cursor.string(index: Int): String {
    return this.getString(index)
}

fun Cursor.int(index: Int): Int {
    return this.getInt(index)
}
