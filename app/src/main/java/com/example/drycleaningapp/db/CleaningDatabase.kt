package com.example.drycleaningapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.drycleaningapp.db.dao.OrderDao
import com.example.drycleaningapp.model.Order

@Database(entities = [Order::class], version = 1, exportSchema = false)
abstract class CleaningDatabase : RoomDatabase() {
    abstract fun orderDao(): OrderDao

    companion object {
        @Volatile
        private var INSTANCE: CleaningDatabase? = null

        fun getDatabase(context: Context): CleaningDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CleaningDatabase::class.java,
                    "CLEANING"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}