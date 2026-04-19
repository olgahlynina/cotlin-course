package ru.stimmax.lessons.lesson05.homeworks

fun main() {
    // Задача 1
    // Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
    //Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
    val initialSoundIntensity: Double = 0.9
    val baseCoefficient: Double = 0.5
    val coefficientAttenuationSound: Double? = 0.4 // может быть null
    val intensitySoundAfterAttenuation = initialSoundIntensity * (coefficientAttenuationSound ?: baseCoefficient)

    // Задача 2
    //Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
    //Задача: Рассчитать полную стоимость доставки.
    val costCargo: Double? = 500.00 // может быть null
    val standardCostCargo: Double = 50.00
    val finalBaseCost = costCargo ?: standardCostCargo
    val insuranceCargo = finalBaseCost * (0.5 / 100)
    val deliveryCost = finalBaseCost + insuranceCargo

    // Задача 3
    //Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
    val atmosphericPressure: String? = "747 ml rt" // может быть null
    val absenceReadings = atmosphericPressure ?: "Error. There are no atmospheric pressure readings."
}