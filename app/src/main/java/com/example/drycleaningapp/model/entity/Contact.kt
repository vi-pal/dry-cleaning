package com.example.drycleaningapp.model.entity

data class Contact(
    val id: Int,
    val contactType: ContactType,
    val costumer: Costumer,
    val value: String
)