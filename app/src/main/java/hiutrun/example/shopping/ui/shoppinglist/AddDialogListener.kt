package hiutrun.example.shopping.ui.shoppinglist

import hiutrun.example.shopping.data.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item:ShoppingItem)
}