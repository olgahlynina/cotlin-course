package ru.stimmax.lessons.lesson18.homeworks

import ru.stimmax.lessons.lesson18.homeworks.Fridge1
import ru.stimmax.lessons.lesson18.homeworks.Kettle
import ru.stimmax.lessons.lesson18.homeworks.Oven
import ru.stimmax.lessons.lesson18.homeworks.Washer1

fun main() {
    println("= ХОЛОДИЛЬНИК =")
    val fridge = Fridge1()

    fridge.powerOn()
    fridge.setTemperature(4)
    fridge.setTemperature(15)
    fridge.open()
    fridge.close()
    fridge.programAction("Суперморозка")
    fridge.execute()
    fridge.powerOff()

    println("\n= СТИРАЛЬНАЯ МАШИНА =")
    val washer = Washer1()

    washer.setTemperature(60)
    washer.powerOn()
    washer.connectToWaterSupply()
    washer.setTimer(90)
    washer.programAction("Хлопок 60°")
    washer.setTemperature(60)
    washer.open()
    washer.startWash()
    washer.close()
    washer.startWash()
    washer.drain()
    washer.clean()
    washer.execute()
    washer.powerOff()

    println("\n= ЧАЙНИК =")
    val kettle = Kettle()

    kettle.setTemperature(100)
    kettle.powerOn()
    kettle.setTemperature(100)
    kettle.fillWater(1)
    kettle.setTemperature(100)
    kettle.open()
    kettle.getWater(1)
    kettle.close()
    kettle.programAction("Зелёный чай 80°")
    kettle.execute()
    kettle.powerOff()

    println("\n= ДУХОВКА =")
    val oven = Oven()

    oven.setTemperature(180)
    oven.powerOn()
    oven.setTemperature(180)
    oven.setTemperature(280)
    oven.open()
    oven.close()
    oven.programAction("Конвекция 200°")
    oven.programAction("Гриль 220°")
    oven.execute()
    oven.startMonitoring()
    oven.powerOff()
}
