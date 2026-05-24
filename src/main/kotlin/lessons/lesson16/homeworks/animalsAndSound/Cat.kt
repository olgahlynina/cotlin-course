package ru.stimmax.lessons.lesson16.homeworks.animalsAndSound

class Cat : Animal() {
    override fun makeSound() {
        printColored("Cat makes sound 'Meow'", Colors.YELLOW)
    }
}