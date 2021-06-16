package com.example.drycleaningapp.model.repositories

import com.example.drycleaningapp.model.entity.Order
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrdersRepositoryImpl @Inject constructor() {

    /*suspend fun getAllOrders(): MutableLiveData<List<Order>> = withContext(Dispatchers.IO) {
    }*/

    suspend fun addOrder(order: Order) {
        //dao.addOrder(order)
    }
}