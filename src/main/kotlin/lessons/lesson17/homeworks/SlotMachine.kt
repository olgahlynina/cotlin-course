package ru.stimmax.lessons.lesson17.homeworks

//1)Игровой автомат
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

class SlotMachine(
    val color: String,
    val model: String,
    val hasJoystick: Boolean,
    private val pinCode: String
) {
    val installedGames = mutableListOf(
        "Pac-Man",
        "Mortal Kombat",
        "Crazy Monkey"
    )
    var owner = ""
    var supportPhoneNumber = "88003361254"
        private set

    private var operatingSystemLoaded = false
    private var balanceProceeds = 0.0
    private var gameSessionPaid = false
    private val costGameSession = 500.00
    private var isOn = false

    fun turnOn() {
        isOn = true
        loadOS()
    }

    fun turnOff() {
        isOn = false
        shutDownOS()
    }

    fun showListGames() = installedGames.toList()

    fun payGameSession(amount: Double) {
        if (amount >= costGameSession) {
            balanceProceeds += costGameSession
            gameSessionPaid = true
            println("Game session paid. You can play now.")
        } else {
            println("Insufficient funds. Game session costs $costGameSession")
        }
    }

    fun playGame(gameName: String) {
        if (!isOn) {
            println("Machine is off. Turn it on first.")
            return
        }
        if (!installedGames.contains(gameName)) {
            println("Game '$gameName' not found.")
            return
        }
        if (gameSessionPaid) {
            println("Playing '$gameName'... Have fun!")
            gameSessionPaid = false
        } else {
            println("Please pay for the game session first (cost: $costGameSession).")
        }
    }

    fun withdraw(code: String): Double {
        if (code != pinCode) {
            println("Wrong PIN code. Withdrawal denied.")
            return 0.0
        }
        val amount = balanceProceeds
        balanceProceeds = 0.0
        println("Withdrew $amount. Safe is open. Take your money.")
        openSafe()
        return amount
    }

    private fun loadOS() {
        operatingSystemLoaded = true
        println("Loading OS... System ready.")
    }

    private fun shutDownOS() {
        operatingSystemLoaded = false
        println("Shutting down OS... Goodbye.")
    }

    private fun openSafe() {
        println("Safe is open. Collect the cash.")
    }
}