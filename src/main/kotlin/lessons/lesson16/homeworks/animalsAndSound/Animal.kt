package ru.stimmax.lessons.lesson16.homeworks.animalsAndSound

                        //Переопределение методов
// 1. Животные и Их Звуки
//1)Базовый класс: Animal с методом makeSound().
//2)Классы наследники: Dog, Cat, Bird.
//3)Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//4)Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//5)Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound")
    }
}