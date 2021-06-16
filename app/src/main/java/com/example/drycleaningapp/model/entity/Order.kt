package com.example.drycleaningapp.model.entity

data class Order(
    val id: Int,
    val costumer: Costumer,
    val number: Int,
    val date: String,
    val dateExecution: String,
    val dateIssued: String
)