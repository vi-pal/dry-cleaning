package com.example.drycleaningapp.presentation.screens.orders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.drycleaningapp.model.entity.Order
import com.example.drycleaningapp.model.repositories.OrdersRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrdersViewModel @Inject constructor(private val repositoryImpl: OrdersRepositoryImpl) : ViewModel() {

    private var _orders: MutableLiveData<List<Order>> = MutableLiveData()

    fun getOrders() {
        CoroutineScope(Dispatchers.IO).launch {
            //_orders = repositoryImpl.getAllOrders()
        }
    }

    fun addOrder(order: Order) {
        CoroutineScope(Dispatchers.IO).launch {
            repositoryImpl.addOrder(order)
        }
    }

    val orders: LiveData<List<Order>> get() = _orders
}