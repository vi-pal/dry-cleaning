package com.example.drycleaningapp.model.entity

data class Costumer(
    val id: Int,
    val status: Status,
    val fullName: String,
    val address: String
)