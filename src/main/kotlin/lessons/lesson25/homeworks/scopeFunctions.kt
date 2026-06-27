package ru.stimmax.lessons.lesson25.homeworks

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

// Задание 3: Функция форматированного вывода через сontext-функцию with
fun printPersonInfo(person: Person) {
    with(person) {
        println("=== Профиль сотрудника ===")
        println("Имя: $name")
        println("Возраст: $age")
        println("Email: ${if (email.isEmpty()) "не указан" else email}")
        println("==========================")
    }
}

// Задание 6: Функция безопасного преобразования nullable-объекта через let и also
fun Person?.toEmployee(position: String, depart: String): Employee? =
    this?.let {
        Employee(it.name, it.age, position).also { emp ->
            emp.email = it.email
            emp.department = depart
        }
    }