package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DESCRIPTION")
data class Description(
    @PrimaryKey
    @ColumnInfo(name = "ID_DESCRIPTION") val id: Int,
    @ColumnInfo(name = "VALUE") val value: String,
)