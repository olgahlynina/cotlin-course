package ru.stimmax.lessons.lesson16.homeworks.animalsAndSound

class Bird : Animal() {
    override fun makeSound() {
        printColored("Bird makes sound 'Tweet'", Colors.PURPLE)
    }
}