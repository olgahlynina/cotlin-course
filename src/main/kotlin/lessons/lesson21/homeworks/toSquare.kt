package ru.stimmax.lessons.lesson21.homeworks

//Задача 4
//Создайте функцию-расширение класса Any toSquare.
//Функция гарантированно вызывается у числа (в виде числа или строки, например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа.
//Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.
fun Any.toSquare(): Double {
    val value = when (this) {
        is Number -> this.toDouble()
        is String -> this.toDouble()
        else -> 0.0
    }
    return value * value
}