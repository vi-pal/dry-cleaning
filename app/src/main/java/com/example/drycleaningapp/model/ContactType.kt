package com.example.drycleaningapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CONTACT_TYPE")
data class ContactType(
    @PrimaryKey
    @ColumnInfo(name = "ID_CONTACT_TYPE") val id: Int,
    @ColumnInfo(name = "NAME") val name: String,
)