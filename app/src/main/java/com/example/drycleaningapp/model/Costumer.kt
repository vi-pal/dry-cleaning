package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "COSTUMER")
data class Costumer(
    @PrimaryKey
    @ColumnInfo(name = "ID_COSTUMER") val id: Int,
    @ColumnInfo(name = "ID_STATUS") val idStatus: Int,
    @ColumnInfo(name = "FULL_NAME") val fullName: String,
    @ColumnInfo(name = "ADDRESS") val address: String,
)