package ru.stimmax.lessons.lesson26.homeworks

import java.io.File

fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
    task7()
    task8()
    task6()
}

// Задача 1
fun task1() {
    File("workspace/task1/example.txt").apply {
        parentFile?.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
        if (exists()) println("Файл существует") else println("Файл не найден")
    }
}

// Задача 2
fun task2() {
    File("workspace/task2/testDir").apply {
        mkdirs()
        when (isDirectory) {
            true -> println("Это директория")
            false -> println("Это не директория")
        }
        println(absolutePath)
    }
}

// Задача 3
fun task3() {
    with(File("workspace/task3/structure")) {
        mkdirs()
        resolve("myDir")
    }.apply {
        mkdir()
        resolve("subDir1").mkdir()
        resolve("subDir2").mkdir()
        val foundFiles = list()?.toList() ?: emptyList()
        if (foundFiles.contains("subDir1") && foundFiles.contains("subDir2")) {
            println("Директории найдены")
        } else {
            println("Директории не найдены в ${foundFiles.joinToString()}")
        }
    }
}

// Задача 4
fun task4() {
    File("workspace/task4/temp").apply {
        mkdirs()
        mapOf(
            "dir1" to true,
            "file1" to false,
            "dir2" to true,
            "dir3" to true,
            "file2" to false,
            "file3" to false
        ).forEach { (nodeName, isDirectory) ->
            resolve(nodeName).also {
                if (isDirectory) {
                    it.mkdir()
                } else {
                    it.createNewFile()
                }
            }
        }
        check(list()?.count() == 6) { "Список файлов и директорий не полный ${list()?.joinToString()}" }
        parentFile.deleteRecursively()
    }
    if (File("workspace/task4").exists()) error("Директория task4 все еще существует")
}

// Задача 5
fun task5() {
    with(File("workspace/task5/config/config.txt")) {
        parentFile.mkdirs()
        createNewFile()
        listOf("param 1 = true", "param 2 = false").also { lines ->
            writeText(lines.joinToString("\n"))
        }
        readLines().map { line ->
            line.substringAfter("=").trim()
        }.also { values ->
            println(values.joinToString())
        }
    }
}

// Задача 6
fun task6() {
    File("workspace").apply {
        walkTopDown().groupBy { if (it.isDirectory) "dir" else "file" }
            .also { nodesMap ->
                println("Directories")
                nodesMap["dir"]?.forEach { println(it) }
                println("Files")
                nodesMap["file"]?.forEach { println(it) }
            }
    }
}

// Задача 7
fun task7() {
    val readmeContent = "This is a README file."
    File("workspace/task7/docs/readme.md").apply {
        parentFile?.mkdirs()
        if (!exists()) {
            createNewFile()
            writeText(readmeContent)
        }
        check(readText() == readmeContent)
    }
}

// Задача 8
fun task8() {
    File("workspace/task8").deleteRecursively()
    listOf(
        "workspace/task8/data/1/4/prod/data14.mysql",
        "workspace/task8/data/2/3/prod/data23.mysql",
        "workspace/task8/data/5/2/prod/data52.mysql",
    ).forEach { path ->
        File(path).apply {
            parentFile?.mkdirs()
        }.createNewFile()
    }
    val backupDir = File("workspace/task8/backup").also { it.mkdirs() }
    File("workspace/task8/data").apply {
        walkTopDown().filter { it.isFile }
            .forEach { file ->
                val relativePath = file.relativeTo(this)
                file.copyTo(backupDir.resolve(relativePath), overwrite = true)
            }
    }
}