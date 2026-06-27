package ru.stimmax.lessons.lesson25.homeworks

fun main() {
    // === Задание 1: Замер времени ===
    val ex = {
        val list = List(10_000_000) { (0..10000).random() }
        list.sorted()
        Unit
    }
    val elapsedTime = timeTracker(ex)
    println("Время выполнения функции: $elapsedTime мс\n")

    // === Задание 2: Использование apply для инициализации объекта Employee ===
    val employee = Employee("Лилия", 35, "Тестировщик").apply {
        email = "lily@company.com"
        department = "Mobile QA department"
    }

    // === Задание 3: Использование also для добавления почты и вызова логирования ===
    val person = Person("Дмитрий", 37).also {
        it.email = "dmitry@email.com"
        printPersonInfo(it)
    }

    // === Задание 4: Использование with для преобразования Person в Employee ===
    val personForWith = Person("Ева", 31)
    val employeeFromWith: Employee = with(personForWith) {
        Employee(name, age, "Mobile QA")
    }

    // === Задание 5: Использование run для преобразования и инициализации Employee ===
    val person1 = Person("Ева", 31)
    val employeeFromRun: Employee = person1.run {
        Employee(name, age, "Mobile QA")
    }

    // === Задание 6: Проверка работы безопасного преобразования (toEmployee) ===
    val nullablePerson: Person? = Person("Анна", 25).apply { email = "anna@test.com" }
    val employeeFromLet = nullablePerson.toEmployee("Android Developer", "Mobile Team")
    println("\nРезультат Задания 6 (Email нового Employee): ${employeeFromLet?.email}")

    // Проверка кейса, если Person пришел null
    val nullPerson: Person? = null
    val nullEmployee = nullPerson.toEmployee("Тимлид", "Архитектура")
    println("Результат Задания 6 с null-объектом: $nullEmployee")
}