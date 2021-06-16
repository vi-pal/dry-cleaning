package com.example.drycleaningapp.model.entity

data class Item(
    val id: Int,
    val itemType: ItemType,
    val description: Description,
    val dirtLevel: DirtLevel,
    val order: Order,
    val number: Int,
    val cleaningType: String,
    val price: Float
)