package ru.stimmax.lessons.lesson18.homeworks

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//Холодильник
//Стиральная машина
//Умная лампа
//Электронные часы
//Робот-пылесос
//Механические часы
//Фонарик
//Кофемашина
//Умная колонка

abstract class Fridge : Powerable, Openable, TemperatureRegulatable

abstract class Washer : Powerable, Openable, TemperatureRegulatable, WaterConnection, AutomaticShutdown, Drainable, Timable, Programmable, Cleanable

abstract class SmartLamp : Powerable, AutomaticShutdown, Timable, LightEmitting, Programmable

abstract class ElectronicWatches : Powerable, Openable, Timable, BatteryOperated

abstract class RobotVacuumCleaner : Powerable, Openable, WaterContainer, WaterConnection, AutomaticShutdown, Drainable, Programmable, Movable, Cleanable, Rechargeable

abstract class MechanicalWatches : Openable, Mechanical

abstract class Lantern : Powerable, LightEmitting, Rechargeable

abstract class CoffeeMachine : Powerable, Openable, WaterContainer, AutomaticShutdown

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, Rechargeable
