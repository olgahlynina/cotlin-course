package ru.stimmax.lessons.lesson29.homework

import com.google.gson.GsonBuilder
import java.io.File


// Задание 1
data class Employee(
    val fullName: String,
    val isActive: Boolean,
    val dateOfBirth: String,
    val jobTitle: CharacterTypes,
    val teamMembers: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM, // Customer Relationship Manager
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

// Задание 2
fun generateStaffTree(): Employee {
    val frontendLead = Employee(
        fullName = "Дмитрий",
        isActive = true,
        dateOfBirth = "14.05.1992",
        jobTitle = CharacterTypes.TEAM_LEAD,
        teamMembers = listOf(
            Employee("Анна", true, "22.11.1996", CharacterTypes.UX_UI),
            Employee("Игорь", true, "03.08.1994", CharacterTypes.FRONTEND_DEV)
        )
    )

    val backendLead = Employee(
        fullName = "Сергей",
        isActive = true,
        dateOfBirth = "29.09.1989",
        jobTitle = CharacterTypes.TEAM_LEAD,
        teamMembers = listOf(
            Employee("Ольга", true, "17.02.1995", CharacterTypes.BACKEND_DEV),
            Employee("Антон", true, "11.12.1991", CharacterTypes.SYSADMIN),
            Employee("Елена", true, "05.07.1993", CharacterTypes.QA)
        )
    )

    val manager = Employee(
        fullName = "Алексей",
        isActive = true,
        dateOfBirth = "20.03.1988",
        jobTitle = CharacterTypes.PM,
        teamMembers = listOf(frontendLead, backendLead)
    )

    val crmExpert = Employee(
        fullName = "Мария",
        isActive = true,
        dateOfBirth = "12.10.1993",
        jobTitle = CharacterTypes.CRM
    )

    return Employee(
        fullName = "Владимир",
        isActive = true,
        dateOfBirth = "01.12.1983",
        jobTitle = CharacterTypes.CTO,
        teamMembers = listOf(manager, crmExpert)
    )
}

// Задание 3
fun exportEmployeeToJson(employee: Employee, filePath: String) {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val jsonOutput = gson.toJson(employee)
    File(filePath).writeText(jsonOutput)
}

// Задание 4
fun importEmployeeFromJson(filePath: String) {
    val file = File(filePath)

    if (file.exists()) {
        val deserializedResult = GsonBuilder().create().run {
            val fileContent = file.readText()
            fromJson(fileContent, Employee::class.java)
        }

        println("--- Объект восстановлен из JSON ---")
        println(deserializedResult)
    } else {
        println("Файл по пути $filePath не найден.")
    }
}

fun main() {
    val fileName = "staff_structure.json"

    val ctoStaff = generateStaffTree()

    exportEmployeeToJson(ctoStaff, fileName)
    println("Данные сохранены в файл $fileName")

    importEmployeeFromJson(fileName)
}
