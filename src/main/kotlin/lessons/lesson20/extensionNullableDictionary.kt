package ru.stimmax.lessons.lesson20

//3)Создайте функцию-расширение для nullable словаря с дженериком:
//-Ключ является дженериком
//-Значение является списком из дженериков
//-Принимает целое число
//-Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
//-Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента, если такого индекса нет - значением будет null
fun <K : Any, V> Map<K, List<V>>?.extensionNullableDictionary(index: Int): Map<String, V?>? {
    return this?.mapKeys { it.key.toString() }?.mapValues { it.value.getOrNull(index) }
}