package lessons.lesson15.homeworks.educationalEstablishments

class StateUniversity(
    name: String,
    address: String,
    facultiesCount: Int,
    val budgetPlacesCount: Int
) : University(name, address, facultiesCount) {

    fun payStipend() {
        println("Государственный университет $name выплатил стипендию студентам-бюджетникам.")
    }
}