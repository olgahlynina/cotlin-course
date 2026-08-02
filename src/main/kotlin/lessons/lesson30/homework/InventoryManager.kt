package ru.stimmax.lessons.lesson30.homework

class InventoryManager(private val capacity: Int) {
    private val items = mutableMapOf<String, Int>()

    /**
     * Метод возвращает количество инвентаря. Если наименования нет, возвращает 0
     */
    fun getItemCount(itemName: String): Int {
        return items[itemName] ?: 0
    }

    /**
     * Добавляет инвентарь в хранилище к существующему.
     * @param itemName название инвентаря
     * @param quantity количество инвентаря
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    fun addItem(itemName: String, quantity: Int) {
        checkCapacity(quantity)
        items[itemName] = (items[itemName] ?: 0) + quantity
    }

    /**
     * Удаляет инвентарь из хранилища
     * @param itemName название инвентаря
     * @param quantity количество инвентаря для удаления
     * @return true если удаление произошло и false если удаление невозможно
     */
    fun removeItem(itemName: String, quantity: Int): Boolean {
        val currentQuantity = items[itemName] ?: return false
        if (currentQuantity < quantity) {
            return false
        }

        val newQuantity = currentQuantity - quantity
        if (newQuantity == 0) {
            items.remove(itemName)
        } else {
            items[itemName] = newQuantity
        }
        return true
    }

    /**
     * Проверяет, что количество объектов в инвентаре с учётом добавляющихся не превысит допустимого количества
     */
    private fun checkCapacity(itemsForAdding: Int) {
        val currentTotal = items.values.sum()
        check(capacity - currentTotal >= itemsForAdding) {
            "Количество инвентаря не должно превышать $capacity единиц"
        }
    }
}