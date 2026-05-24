package ru.stimmax.lessons.lesson16.homeworks.animalsAndSound

class Dog : Animal() {
    override fun makeSound() {
        printColored("Dog makes sound 'Bark'", Colors.RED)
    }
}