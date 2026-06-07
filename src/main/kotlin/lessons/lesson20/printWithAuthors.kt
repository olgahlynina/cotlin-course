package ru.stimmax.lessons.lesson20

//6)Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть).
// Напиши метод расширения строки, который будет принимать список имён пользователей и выводить в консоли исходную строку побуквенно в верхнем регистре в столбик:
// -имя автора и букву под ним.
fun String.printWithAuthors(authors: List<String>) {
    require(length <= authors.size) {
        "Авторов не меньше, чем букв в строке"
    }
    uppercase().forEachIndexed { index, letter ->
        println(authors[index])
        println(letter)
        println()
    }
}
