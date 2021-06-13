package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ITEM_TYPE")
data class ItemType(
    @PrimaryKey
    @ColumnInfo(name = "ID_ITEM_TYPE") val id: Int,
    @ColumnInfo(name = "NAME") val name: String,
)