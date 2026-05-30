package ru.stimmax.lessons.lesson17.homeworks

fun main() {
    val child = ChildrenClass(
        privateVal = "Приватное значение",
        protectedVal = "Защищенное значение",
        publicVal = "Публичное значение"
    )

    println(child.getAll())

    child.publicField = "Антонио Бандерас"

    child.changeProtectedField("измененное защищенное поле через наследника")

    child.setPrivateField("измененное приватное поле")

    println(child.getAll())
}