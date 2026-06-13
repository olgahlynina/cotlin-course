package ru.stimmax.lessons.lesson22

import org.jetbrains.annotations.Nullable

//Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//
//1)NullPointerException
//2)IndexOutOfBoundsException
//3)ClassCastException
//4)IllegalArgumentException
//5)NumberFormatException
//6)IllegalStateException
//7)OutOfMemoryError
//8)StackOverflowError
//Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок

fun main() {

    //1) NullPointerException
    val counter: Char? = null
    try {
        counter!!
    } catch (e: NullPointerException) {
        println(e.message)
    }

    //2) IndexOutOfBoundsException
    val list = listOf(1, 2, 3)
    try {
        list[3]
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    }

    //3) ClassCastException
    val arg: Any = "lkkf"
    try {
        arg as Int
    } catch (e: ClassCastException) {
        println(e.message)
    }

    //4) IllegalArgumentException
    try {
        addGoods(-3)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    //5) NumberFormatException
    val arg2: String = "lkkf"
    try {
        arg2.toFloat()
    } catch (e: NumberFormatException) {
        println("Not a number")
    }

    //6) IllegalStateException

    try {
        addGoods1(-3)
    } catch (e: IllegalStateException) {
        println(e.message)
    }

    //7) OutOfMemoryError
    try {
        val arg3 = mutableListOf<Float>()
        while (true) {
            arg3.add(0.1F)
        }
    } catch (e: OutOfMemoryError) {
        println(e.message)
    }

    //8) StackOverflowError
    try {
        fun1()
    } catch (e: StackOverflowError) {
        println("Stack overflow")
    }

//    Задание 11)
    throw MyException("Критическая ошибка: нарушена внутренняя логика программы!")

//    Задание 12)
//    try {
//        val list = emptyList<String>()
//
//        val item = list[0]
//
//    } catch (e: IndexOutOfBoundsException) {
//        println("Перехвачено стандартное исключение: $e")
//
//        throw MyRuntimeException(e)
//    }

}

fun addGoods(goodsCount: Int) {
    require(goodsCount > 0) { "Goods count must be > 0" }
}

fun addGoods1(goodsCount: Int) {
    check(goodsCount > 0) { "Goods count must be > 0" }
}

fun fun1() {
    fun1()
}