package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.concurrent.ExecutionException

@Entity(tableName = "ORDERS")
data class Order(
    @PrimaryKey
    @ColumnInfo(name = "ID_ORDER") val id: Int,
    @ColumnInfo(name = "ID_COSTUMER") val idCostumer: Int,
    @ColumnInfo(name = "NUMBER") val number: Int,
    @ColumnInfo(name = "DATE") val date: String,
    @ColumnInfo(name = "DATE_EXECUTION") val dateExecution: String,
    @ColumnInfo(name = "DATE_ISSUED") val dateIssued: String
)