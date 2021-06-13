package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CONTACT")
data class Contact(
    @PrimaryKey
    @ColumnInfo(name = "ID_CONTACT") val id: Int,
    @ColumnInfo(name = "ID_CONTACT_TYPE") val idContactType: Int,
    @ColumnInfo(name = "ID_COSTUMER") val idCostumer: Int,
    @ColumnInfo(name = "VALUE") val value: String,
)