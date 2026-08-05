package ru.stimmax.lessons.lesson31.homework

class PhoneNumberFormatter {
    fun formatPhoneNumber(phone: String): String {
        var cleaned = phone.replace("\\D".toRegex(), "")
            .takeIf { it.length == 10 || it.length == 11 }
            ?: throw IllegalArgumentException("Некорректная длина номера телефона")

        if (cleaned.length == 11) {
            cleaned = cleaned.takeIf { it.startsWith("7") || it.startsWith("8") }
                ?.drop(1)
                ?: throw IllegalArgumentException("Номер должен начинаться с 7 или 8")
        }

        return cleaned.let { digits ->
            val code = digits.substring(0, 3)
            val main = digits.substring(3, 6)
            val p1 = digits.substring(6, 8)
            val p2 = digits.substring(8, 10)
            "+7 ($code) $main-$p1-$p2"
        }
    }
}