package ru.stimmax.lessons.lesson16.homeworks.basketGoods

         // Перегрузка методов
// 4. Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//1)Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
//2)Выполнить перегрузку addToCart который:
//-Принимает два аргумента (itemId и количество amount)
//-Принимает словарь из id и количества и добавляет всё в корзину
//-Принимает список из id (добавляет по одной единице).
//3)Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//4)Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//5)Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое количество артикулов и общее количество всего товара в корзине.
class ShoppingCart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        if (amount > 0) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    fun addToCart(newItems: Map<String, Int>) {
        for ((itemId, amount) in newItems) {
            this.addToCart(itemId, amount)
        }
    }

    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            this.addToCart(itemId)
        }
    }

    override fun toString(): String {
        if (items.isEmpty()) {
            return "Корзина пуста."
        }

        val sb = StringBuilder()
        sb.append("\n=== СОДЕРЖИМОЕ КОРЗИНЫ ===\n")
        sb.append(String.format("%-15s | %-10s\n", "ID Товара", "Количество"))
        sb.append("-----------------------------\n")

        var totalItemsCount = 0

        for ((itemId, amount) in items) {
            sb.append(String.format("%-15s | %-10d\n", itemId, amount))
            totalItemsCount += amount
        }

        sb.append("-----------------------------\n")
        sb.append("Итого уникальных артикулов: ${items.size}\n")
        sb.append("Общее количество товаров: $totalItemsCount\n")

        return sb.toString()
    }
}
