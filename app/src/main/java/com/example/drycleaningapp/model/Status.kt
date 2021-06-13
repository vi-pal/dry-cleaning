package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CONTACT_TYPE")
data class Status(
    @PrimaryKey
    @ColumnInfo(name = "ID_STATUS") val id: Int,
    @ColumnInfo(name = "NAME") val name: String,
    @ColumnInfo(name = "DISCOUNT") val discount: Int
)