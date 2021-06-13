package com.example.drycleaningapp.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.drycleaningapp.model.Order

@Dao
interface OrderDao {
    @Query("select * from ORDERS order by ID_ORDER asc")
    fun readAllOrders(): LiveData<List<Order>>
}