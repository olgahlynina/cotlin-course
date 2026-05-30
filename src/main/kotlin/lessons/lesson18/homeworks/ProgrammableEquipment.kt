package ru.stimmax.lessons.lesson18.homeworks

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammableEquipment : PowerableEquipment(), Programmable, AutomaticShutdown {

    private val programmedActions = mutableListOf<String>()

    override fun programAction(action: String) {
        programmedActions.add(action)
        println("Запрограммировано действие: $action")
    }

    override fun execute() {
        if (programmedActions.isEmpty()) {
            println("Нет запрограммированных действий")
            return
        }
        println("Выполнение запрограммированных действий...")
        programmedActions.forEachIndexed { index, action ->
            println("  ${index + 1}. $action")
        }
        programmedActions.clear()
        println("Выполнение завершено")
    }

    override val sensorType: String get() = "temperature_sensor"
    override val maxSensoredValue: Int get() = 85

    private var isMonitoring = false

    override fun startMonitoring() {
        isMonitoring = true
        println("Мониторинг '$sensorType' запущен. Максимальное значение: $maxSensoredValue")
    }

    fun stopMonitoring() {
        isMonitoring = false
        println("Мониторинг остановлен")
    }

    fun isMonitoringActive(): Boolean = isMonitoring

    fun clearProgrammedActions() {
        programmedActions.clear()
        println("Запрограммированные действия очищены")
    }
}
