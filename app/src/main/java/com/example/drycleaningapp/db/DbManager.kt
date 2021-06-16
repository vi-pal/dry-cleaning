package com.example.drycleaningapp.db

import android.content.Context
import android.database.Cursor
import com.example.drycleaningapp.model.entity.*
import com.example.drycleaningapp.utils.DatabaseHelper
import com.example.drycleaningapp.utils.string
import com.example.drycleaningapp.utils.int
import java.lang.Error

class DbManager private constructor(context: Context) {

    private val helper: DatabaseHelper = DatabaseHelper(context)
    private var db = helper.writableDatabase

    fun getAllOrdersAsc(): List<Order> {
        val items = mutableListOf<Order>()
        val c: Cursor = db.rawQuery(
            "select * from orders order by id_order ASC",
            null
        )
        if (c.moveToFirst()) {
            do {
                items.add(
                    Order(
                        c.int(0), getCostumerById(c.int(1)),
                        c.int(2), c.string(3).substring(0, 10),
                        c.string(4), c.string(5)
                    )
                )
            } while (c.moveToNext())
            c.close()
        }
        return items
    }

    private fun getCostumerById(id: Int): Costumer {
        var item: Costumer? = null
        val c: Cursor = db.rawQuery(
            "select * from costumer where id_costumer like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = Costumer(
                    c.int(0), getStatusById(c.int(1)),
                    c.string(2), c.string(3)
                )
            } while (c.moveToNext())
        }
        c.close()
        return item!!
    }

    private fun getStatusById(id: Int): Status {
        var item: Status? = null
        val c: Cursor = db.rawQuery(
            "select * from status where id_status like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = Status(
                    c.int(0), c.string(1),
                    c.int(2)
                )
            } while (c.moveToNext())
        }
        c.close()
        return item!!
    }

    private fun getItemTypeById(id: Int): ItemType {
        var item: ItemType? = null
        val c: Cursor = db.rawQuery(
            "select * from item_type where id_item_type like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = ItemType(
                    c.int(0), c.string(1)
                )
            } while (c.moveToNext())
        }
        c.close()
        return item!!
    }

    private fun getDescriptionById(id: Int): Description {
        var item: Description? = null
        val c: Cursor = db.rawQuery(
            "select * from description where id_description like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = Description(
                    c.int(0), c.string(1)
                )
            } while (c.moveToNext())
        }
        c.close()
        return item!!
    }

    fun getItemsFromOrder(orderId: Int): List<Item> {
        val items = mutableListOf<Item>()
        val c: Cursor = db.rawQuery(
            "select * from item where id_order like $orderId",
            null
        )
        if (c.moveToFirst()) {
            do {
                items.add(
                    Item(
                        c.int(0),
                        getItemTypeById(c.int(1)),
                        getDescriptionById(c.int(1)),
                        getDirtLevelById(c.int(1)),
                        getOrderById(c.int(1)),
                        c.int(5),
                        c.string(6),
                        c.getFloat(7)
                    )
                )
            } while (c.moveToNext())
            c.close()
        }
        return items
    }


    private fun getOrderById(id: Int): Order {
        var item: Order? = null
        val c: Cursor = db.rawQuery(
            "select * from orders where id_order like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = Order(
                    c.int(0), getCostumerById(c.int(1)),
                    c.int(2), c.string(3).substring(0, 10),
                    c.string(4), c.string(5)
                )
            } while (c.moveToNext());
        }
        c.close()
        return item!!
    }

    private fun getDirtLevelById(id: Int): DirtLevel {
        var item: DirtLevel? = null
        val c: Cursor = db.rawQuery(
            "select * from dirt_level where id_dirt_level like $id",
            null
        )
        if (c.moveToFirst()) {
            do {
                item = DirtLevel(
                    c.int(0), c.string(1)
                )
            } while (c.moveToNext());
        }
        c.close()
        return item!!
    }

    init {
        try {
            helper.updateDataBase()
        } catch (ex: Exception) {
            throw Error("cant update|init")
        }
        db = helper.writableDatabase
    }

    companion object : SingletonHolder<DbManager, Context>(::DbManager)
}