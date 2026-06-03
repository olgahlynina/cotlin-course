package ru.stimmax.lessons.lesson19.homeworks

//4)Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой.
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(element: String): List<String> {
        return element.split(" ")
    }

    override fun mapList(list: List<String>): List<List<String>> {
        return list.map { map(it) }
    }
}

