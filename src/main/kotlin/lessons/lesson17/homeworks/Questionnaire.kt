package ru.stimmax.lessons.lesson17.homeworks

//2)Почемучка
//Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях и заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass.
    // 1)Потому, что в ChildrenClass создано независимое новое поле, которое перекрывает родительское
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // 2)Потому, что поле имеет модификатор доступа "protected" и доступно из данного класса или класса-наследника
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun setPrivateField(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    //7)Потому, что она возвращает "protected"
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    //8)Потому, что generate переопределен в ChildrenClass и распечатывается из дочернего класса
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    //9)Потому, что она возвращает PrivateClass
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //10)Потому, что из main мы обратимся к аргументу родителя, а там он объявлен как val
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    //11)Потому, что getAll() есть в родительском BaseClass и не является приватным или защищенным, значит автоматически наследуется ChildrenClass
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    //12)Выводится "Печать из класса BaseClass". Переопределение не происходит потому, что privatePrint() в родительском с модификатором private
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    override fun verifyPublicField(value: String): Boolean {
        return if (value == "Антонио Бандерас") true
        else super.verifyPublicField(value)
    }

    fun changeProtectedField(value: String) {
        protectedField = value
    }
}