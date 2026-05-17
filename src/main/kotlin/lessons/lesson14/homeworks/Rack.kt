package ru.stimmax.lessons.lesson14.homeworks

// Задание 6. Стеллаж и полки. Стеллаж
class Rack(val maxShelvesCount: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelvesCount || shelves.contains(shelf)) {
            return false
        }
        return shelves.add(shelf)
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()
        val removedShelf = shelves.removeAt(index)
        return removedShelf.getItems()
    }

    fun addItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(itemName)) {
                return true
            }
        }
        return false
    }

    fun removeItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(itemName)) {
                return true
            }
        }
        return false
    }

    fun containsItem(itemName: String): Boolean {
        return shelves.any { it.containsItem(itemName) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("На стеллаже:")
        if (shelves.isEmpty()) {
            println("Стеллаж пуст (нет полок).")
            return
        }
        shelves.forEachIndexed { index, shelf ->
            println("Полка №$index | Общая вместимость: ${shelf.capacity} | Осталось места: ${shelf.getRemainingCapacity()}")
            println("  Предметы: ${shelf.getItems()}")
        }
    }

        fun advancedRemoveShelf(index: Int): List<String> {
            if (index !in shelves.indices) return emptyList()

            val targetShelf = shelves[index]
            val itemsToRedistribute = targetShelf.getItems().sortedByDescending { it.length }
            val failedItems = mutableListOf<String>()

            shelves.removeAt(index)

            for (item in itemsToRedistribute) {
                var distributed = false

                for (shelf in shelves) {
                    if (shelf.addItem(item)) {
                        distributed = true
                        break
                    }
                }

                if (!distributed) {
                    failedItems.add(item)
                }
            }
            return failedItems.toList()
        }
    }