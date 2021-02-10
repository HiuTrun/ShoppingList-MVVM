package hiutrun.example.shopping.ui.shoppinglist

import androidx.lifecycle.ViewModel
import hiutrun.example.shopping.data.entities.ShoppingItem
import hiutrun.example.shopping.data.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel(){

    fun insert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch{
        repository.insert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch{
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}