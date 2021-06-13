package com.example.drycleaningapp

import android.app.Application
import com.example.drycleaningapp.db.CleaningDatabase
import com.example.drycleaningapp.repositories.OrdersRepositoryImpl

class App : Application(){
    val database by lazy { CleaningDatabase.getDatabase(this) }
    val repository by lazy { OrdersRepositoryImpl(database.orderDao()) }
}