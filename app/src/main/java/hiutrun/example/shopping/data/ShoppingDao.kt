package hiutrun.example.shopping.data

import androidx.lifecycle.LiveData
import androidx.room.*
import hiutrun.example.shopping.data.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("select * from shopping_items")
    fun getAllShoppingItem():LiveData<List<ShoppingItem>>
}