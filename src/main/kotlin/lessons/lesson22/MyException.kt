package ru.stimmax.lessons.lesson22

import org.w3c.dom.Text

//Задание 11. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст.
// Выброси это исключение в main

class MyException(message: String) : AssertionError(message)