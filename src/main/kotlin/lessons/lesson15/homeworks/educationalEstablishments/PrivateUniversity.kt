package lessons.lesson15.homeworks.educationalEstablishments

class PrivateUniversity(
    name: String,
    address: String,
    facultiesCount: Int,
    val tuitionFeePerYear: Double
) : University(name, address, facultiesCount) {

    fun grantDiscount() {
        println("Частный университет $name предоставил скидку 10% отличникам за обучение.")
    }
}