package ru.stimmax.lessons.lesson14.homeworks

// 5)Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.
class Concert(val group: String, val venue: String, val price: Double, val capacity: Int) {
    private var ticketsSold = 100

    fun showInfo() {
        println("Концерт группы: $group. Место проведения: $venue. Цена билета: $price. Свободных мест: ${capacity - ticketsSold}")
    }

    fun ticketPurchase() {
        if (ticketsSold < capacity) {
            ticketsSold++
        }
    }
}