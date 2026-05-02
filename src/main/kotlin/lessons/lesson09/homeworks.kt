package ru.stimmax.lessons.lesson09

import java.lang.reflect.Array.set

fun main() {

    // Работа с массивами Array

    // 1)Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // 2)Создайте пустой массив строк размером 10 элементов.
    val numbers2 = Array(10) { "" }

    // 3)Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val numbers3: Array<Double> = Array(5) { index -> index * 2.0 }
    for (element in numbers3) {
        println(element)
    }

    // 4)Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val numbers4: Array<Int> = Array(5) { 0 }
    for (i in numbers4.indices) {
        numbers4[i] = i * 3
    }
    for (element in numbers4) {
        println(element)
    }

    // 5)Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val numbers5: Array<String?> = arrayOf(null, "hi", "world")

    for (element in numbers5) {
        println(element)
    }

    // 6)Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val array2 = Array<Int>(5) { 0 }
    for (i in 0..4) {
        array2[i] = array1[i]
    }
    println("Элементы скопированного массива:")
    for (element in array2) {
        println(element)
    }

    // 7) Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычтя значения одного из другого. Распечатайте полученные значения.
    val numbers6: Array<Int> = arrayOf(4, 8, 10, 12, 14)
    val numbers7: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val numbers8 = Array<Int>(5) { 0 }
    for (i in 0..4) {
        numbers8[i] = numbers6[i] - numbers7[i]
    }
    println("Результат вычитания:")
    for (i in 0..4) {
        println("${numbers6[i]} - ${numbers7[i]} = ${numbers8[i]}")
    }

    // 8)Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val numbers9 = arrayOf(3, 8, 2, 5, 9, 1)
    var index = 0
    var foundIndex = -1

    while (index < numbers9.size) {
        if (numbers9[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println(foundIndex)

    // 9)Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val numbers10: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (element in numbers10) {
        if (element % 2 == 0) {
            println("$element - чётное")
        } else {
            println("$element - нечётное")
        }
    }

    //10)Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    val words = arrayOf("мор", "бяка", "мул", "дом", "ромашка")
    finder(words, "ром")

}

fun finder(strings: Array<String>, searchString: String) {
    for (element in strings) {
        if (element.contains(searchString)) {
            println("Найдено: $element")
            return
        }
    }
    println("Строка '$searchString' не найдена")
}

fun main2() {

// Работа со списками List
// 1)Создайте пустой неизменяемый список целых чисел.
    val list: List<Int> = listOf()

// 2)Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2: List<String> = listOf("Hello", "World", "Kotlin")

// 3)Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

// 4)Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list4.addAll(listOf(6, 7, 8))
    println(list4)

// 5)Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    list5.removeAt(1)
    println(list5)

// 6)Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6: List<Int> = listOf(1, 2, 3, 4, 5)
    for (element in list6) {
        println(element)
    }

// 7)Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7: List<String> = listOf("dad", "mum", "bag")
    val element2 = list7[1]
    println(element2)

// 8)Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val list8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 9
    println(list8)

// 9) Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list9: List<String> = listOf("dad", "mum", "bag")
    val list10: List<String> = listOf("Hello", "World", "Kotlin")
    val combinedList = mutableListOf<String>()

    for (element in list9) {
        combinedList.add(element)
    }

    for (element in list10) {
        combinedList.add(element)
    }

    println(combinedList)

// 10)Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл
    val list11: List<Int> = listOf(1, 2, 3, 4, 5)
    var min = list11[0]
    var max = list11[0]

    for (element in list11) {
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
    }

    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")

    // 11)Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list12: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbers = mutableListOf<Int>()

    for (element in list12) {
        if (element % 2 == 0) {
            numbers.add(element)
        }
    }

    println("Исходный список: $list12")
    println("Четные числа: $numbers")

    // Работа с Множествами Set
    // 1)Создайте пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()

    // 2)Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf<Int>(1, 2, 3)

    // 3)Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf<String>("Kotlin", "Java", "Scala")

    // 4)Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val set4 = mutableSetOf<String>("Kotlin", "Java", "Scala")
    set4.addAll(listOf("Swift", "Go"))
    println(set4)

    // 5)Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set5.remove(2)
    println(set5)

    // 6)Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set6 = setOf<Int>(1, 2, 3, 4, 5)
    for (element in set6) {
        println(element)
    }
}

// 7) Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun finder2(set: Set<String>, string: String) {
    for (element in set) {
        if (element == string) {
            println(true)
            return
        }
    }
    println(false)
}

fun main3() {
    val set = setOf("Kotlin", "Java", "Scala")
    finder2(set, "Scala")
}

// 8)Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
fun main4() {
    val set8 = setOf("Kotlin", "Java", "Scala")
    val mutableList = mutableListOf<String>()

    for (element in set8) {
        mutableList.add(element)
    }

    println("неизменяемое множество: $set8")
    println("изменяемый список: $mutableList")
}






















