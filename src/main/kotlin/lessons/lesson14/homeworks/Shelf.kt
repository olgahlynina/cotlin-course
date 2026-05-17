package ru.stimmax.lessons.lesson14.homeworks

// Задание 6. Стеллаж и полки. Полка Стеллажа
class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    private fun currentUsedSpace(): Int = items.sumOf { it.length }

    fun canAccommodate(itemName: String): Boolean {
        return currentUsedSpace() + itemName.length <= capacity
    }

    fun addItem(itemName: String): Boolean {
        return if (canAccommodate(itemName)) {
            items.add(itemName)
            true
        } else {
            false
        }
    }

    fun removeItem(itemName: String): Boolean {
        return items.remove(itemName)
    }

    fun containsItem(itemName: String): Boolean {
        return items.contains(itemName)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int = capacity - currentUsedSpace()
}