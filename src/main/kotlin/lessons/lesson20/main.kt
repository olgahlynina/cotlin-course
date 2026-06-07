package ru.stimmax.lessons.lesson20

fun main() {
    println(5.within(7, 3))
    println(5.5.within(5.8, 0.5))
    println(10L.within(5.5, 5.0))
    println((-5).within(-3, 3))
    println(10.within(13, 3))

    val original = "I want to go to the sea."
    val shift = 3
    val encrypted = original.encrypt(shift)
    val decrypted = encrypted.decrypt(shift)
    println("Исходная строка: $original")
    println("Зашифрованная строка: $encrypted")
    println("Расшифрованная строка: $decrypted")
    println("Результат: ${original == decrypted}")

    val word = "Пидмаркоз"

    val authors = listOf(
        "@st_grotesque",
        "@butnotverywell",
        "@ya_ebala__",
        "@SadNSober_",
        "@ya_ebala__",
        "@SadNSober_",
        "@ya_ebala__",
        "@SadNSober_",
        "@ya_ebala__"
    )

    word.printWithAuthors(authors)
}