package ru.stimmax.lessons.lesson13

fun main() {

//1)Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val testTiming = mapOf(
        "Регистрация" to 30,
        "Авторизация" to 20,
        "Добавление в корзину" to 5,
    )

    val averageTime = testTiming.values.average()
    println("Среднее время выполнения теста: $averageTime секунд")

//2)Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов, а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testsMetadata = mapOf(
        "Регистрация" to "Автор: Сергей Иванов, Приоритет: высокий, Тип: регресс",
        "Авторизация" to "Автор: Поликарий Свиридов, Приоритет: высокий, Тип: регресс",
        "Добавление в корзину" to "Автор: Ирина Авдеева, Приоритет: средний, Тип: регресс"
    )

    val testMethods = testsMetadata.keys
    println("Список тестовых методов: $testMethods")

//3)В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
val passingTests = mutableMapOf(
    "Регистрация" to "passed",
    "Авторизация" to "passed",
    "Добавление в корзину" to "passed",
    "Добавление в избранное" to "skipped",
    "Переход по диплинку" to "failed",
)
    passingTests["Оплата"] = "passed"
    println(passingTests)

//4)Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val passedCount = passingTests.count { it.value == "passed" }
    println("Количество успешных тестов: $passedCount")
    
//5)Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val bugTracking = mutableMapOf(
        "bug-1" to "New",
        "bug-2" to "Resolved",
        "bug-3" to "In Progress"
    )
    bugTracking.remove("bug-2")
    println(bugTracking)

//6)Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val webTestingResults = mapOf(
        "https://www.google.com" to 200,
        "https://mail.yandex.ru" to 200,
        "example.com" to 404
    )

    for ((url, status) in webTestingResults) {
        println("Страница $url проверена. Статус ответа: $status")
    }

//7)Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val serviceResponses = mapOf(
        "AuthService" to 110,
        "PaymentGateway" to 405,
        "ProductCatalog" to 75
    )

    val exceedingThreshold = serviceResponses.filter { it.value > 400 }

    println(exceedingThreshold)

//8)В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiTestResults = mapOf(
        "/api/login" to "200 OK",
        "/api/users" to "403 Forbidden",
        "/api/cart" to "500 Internal Server Error"
    )

    val targetEndpoint = "/api/login"
    val status = apiTestResults.getOrElse(targetEndpoint) { "Не был протестирован" }
    println("Статус endpoint '$targetEndpoint': $status")

//9)Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val config = mapOf(
        "browserType" to "Chrome",
        "headless" to "true",
        "timeout" to "30"
    )

    val browserType = config.getValue("browserType")
    println("Browser type: $browserType")

//10)Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val versions = mapOf(
        "v1.0" to "Initial release",
        "v1.1" to "Bug fixes"
    )

    val updatedVersions = versions + ("v2.0" to "New features")
    println("Обновленные версии: $updatedVersions")

//11)Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val deviceSettings = mapOf(
        "iPhone12" to "iOS 14, 60fps",
        "Pixel5" to "Android 11, 90fps"
    )

    val model = "iPhone12"
    val settings = deviceSettings.getOrElse(model) { "Default settings" }
    println("Настройки для $model: $settings")

//12)Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errorCodes = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error",
        403 to "Forbidden"
    )

    val containsError = errorCodes.containsKey(404)
    println("Содержит код 404: $containsError")

// 13) Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val testScenarios = mapOf(
        "Test1_v1" to "Passed",
        "Test2_v2" to "Failed",
        "Test3_v1" to "Skipped",
        "Test4_v3" to "Passed"
    )
    val targetVersion = "v1"
    val filteredScenarios = testScenarios.filterKeys { it.contains(targetVersion) }
    println("Сценарии для версии $targetVersion: $filteredScenarios")

    // 14) У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val modules = mapOf(
        "Login" to "Passed",
        "Payment" to "Failed",
        "Search" to "Passed"
    )
    val hasFailed = modules.any { it.value == "Failed" }
    println("Есть неудачные тесты: $hasFailed")

    // 15) Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val envSettings = mutableMapOf(
        "url" to "https://test.com",
        "timeout" to "30"
    )
    val additionalSettings = mapOf(
        "retries" to "3",
        "headless" to "true"
    )
    envSettings.putAll(additionalSettings)
    println("Объединенные настройки: $envSettings")

    // 16) Объедините два неизменяемых словаря с данными о багах.
    val bugs1 = mapOf("BUG-1" to "Open", "BUG-2" to "Closed")
    val bugs2 = mapOf("BUG-3" to "In Progress", "BUG-4" to "Open")
    val mergedBugs = bugs1 + bugs2
    println("Объединенные баги: $mergedBugs")

    // 17) Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    tempResults.clear()
    println("Очищенный словарь: $tempResults")

    // 18) Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены.
    val testReport = mapOf(
        "Login" to "passed",
        "Logout" to "skipped",
        "Payment" to "failed"
    )
    val withoutSkipped = testReport.filterNot { it.value == "skipped" }
    println("Отчет без пропущенных: $withoutSkipped")

    // 19) Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val configs = mapOf(
        "browser" to "Chrome",
        "os" to "Windows",
        "resolution" to "1920x1080",
        "language" to "en"
    )
    val configsCopy = configs - listOf("os", "language")
    println("Копия без os и language: $configsCopy")

    // 20) Создайте отчет о тестировании, преобразовав словарь с результатами в список строк.
    val testResults = mapOf("TC-001" to "Passed", "TC-002" to "Failed", "TC-003" to "Passed")
    val report = testResults.map { "Test ID: ${it.key} -> ${it.value}" }
    println("Отчет: $report")

    // 21) Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val mutableResults = mutableMapOf("test1" to 95, "test2" to 87)
    val immutableResults = mutableResults.toMap()
    println("Неизменяемая копия: $immutableResults")

    // 22) Преобразуйте словарь, заменив идентификаторы тестов на их строковый аналог.
    val numericIds = mapOf(101 to 2.5, 102 to 3.0, 103 to 1.8)
    val stringIds = numericIds.mapKeys { it.key.toString() }
    println("22) Строковые ключи: $stringIds")

    // 23) Увеличьте каждую оценку производительности на 10%.
    val performance = mapOf(
        "v1.0" to 100.0,
        "v1.1" to 95.5,
        "v2.0" to 88.0
    )
    val increasedPerformance = performance.mapValues { it.value * 1.1 }
    println("Увеличенные оценки: $increasedPerformance")

    // 24) Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compilationErrors = mapOf<String, String>()
    val isEmpty = compilationErrors.isEmpty()
    println("Словарь ошибок пуст: $isEmpty")

    // 25) Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults = mapOf("load1" to 120, "load2" to 95)
    val isNotEmpty = loadTestResults.isNotEmpty()
    println("Словарь не пуст: $isNotEmpty")

    // 26) Проверьте, прошли ли успешно все автоматизированные тесты.
    val allTests = mapOf("TC-1" to "Passed", "TC-2" to "Passed", "TC-3" to "Passed")
    val allPassed = allTests.all { it.value == "Passed" }
    println("Все тесты успешны: $allPassed")

    // 27) Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val results = mapOf("TC-1" to "Passed", "TC-2" to "Passed", "TC-3" to "Passed")
    val hasFailed_ = results.any { it.value == "Failed" }
    println("Есть хотя бы один упавший тест: $hasFailed_")

    // 28) Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии "optional".
    val serviceTests = mapOf(
        "optional_login" to "Failed",
        "mandatory_payment" to "Failed",
        "optional_logout" to "Passed",
        "optional_checkout" to "Failed"
    )
    val filteredTests = serviceTests.filter {
        it.key.contains("optional") && it.value != "Passed"
    }
    println("Отфильтрованные тесты: $filteredTests")
}