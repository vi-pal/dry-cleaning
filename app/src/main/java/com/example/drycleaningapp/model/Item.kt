package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ITEM")
data class Item(
    @PrimaryKey
    @ColumnInfo(name = "ID_ITEM") val id: Int,
    @ColumnInfo(name = "ID_ITEM_TYPE") val idItemType: Int,
    @ColumnInfo(name = "ID_DESCRIPTION") val idDescription: Int,
    @ColumnInfo(name = "ID_DIRT_LEVEL") val idDirtLevel: Int,
    @ColumnInfo(name = "ID_ORDER") val idOrder: Int,
    @ColumnInfo(name = "NUMBER") val number: Int,
    @ColumnInfo(name = "CLEANING_TYPE") val cleaningType: String,
    @ColumnInfo(name = "PRICE") val price: Float
)