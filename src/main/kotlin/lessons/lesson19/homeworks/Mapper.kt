package ru.stimmax.lessons.lesson19.homeworks

//3)Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа
interface Mapper<G, H> {
    fun map(element: G): H
    fun mapList(list: List<G>): List<H>
}