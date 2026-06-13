package ru.stimmax.lessons.lesson22

//Задание 10.
// Напиши функцию. Она принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий с этим аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:
//
//NullPointerException
//IndexOutOfBoundsException
//ClassCastException
//IllegalArgumentException
//NumberFormatException
//IllegalStateException
//В блоке catch перехватывай исключение с общим типом Throwable а внутри через when определи тип исключения и выведи сообщение с названием исключения.
// Сразу после when выброси перехваченное исключение через throw, чтобы прекратить работу программы.
// Если аргумент функции не вызвал исключение, то выведи текст, сообщающий, что переданный аргумент фантастически хорош!


fun fun10(arg: Any?) {
    try {

        val nonNullArg = arg!!

        val str = nonNullArg.toString()
        str[str.length + 10]

        nonNullArg as List<*>

        require(false) { "Trigger IllegalArgumentException" }

        "not_a_number".toInt()

        check(false) { "Trigger IllegalStateException" }

        println("Переданный аргумент фантастически хорош!")

    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("Исключение: NullPointerException")
            is IndexOutOfBoundsException -> println("Исключение: IndexOutOfBoundsException")
            is ClassCastException -> println("Исключение: ClassCastException")
            is IllegalArgumentException -> println("Исключение: IllegalArgumentException")
            is NumberFormatException -> println("Исключение: NumberFormatException")
            is IllegalStateException -> println("Исключение: IllegalStateException")
            else -> println("Исключение: Неизвестный тип Throwable")
        }
        throw e
    }
}