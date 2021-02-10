package hiutrun.example.shopping.data.repository

import hiutrun.example.shopping.data.ShoppingDatabase
import hiutrun.example.shopping.data.entities.ShoppingItem

class ShoppingRepository(
    private var db : ShoppingDatabase
) {

    suspend fun insert(item:ShoppingItem) = db.getShoppingDao().insert(item)

    suspend fun delete(item:ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItem()

}