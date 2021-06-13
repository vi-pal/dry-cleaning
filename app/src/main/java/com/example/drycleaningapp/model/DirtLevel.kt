package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CONTACT_TYPE")
data class DirtLevel(
    @PrimaryKey
    @ColumnInfo(name = "ID_DIRT_LEVEL") val id: Int,
    @ColumnInfo(name = "VALUE") val value: String,
)