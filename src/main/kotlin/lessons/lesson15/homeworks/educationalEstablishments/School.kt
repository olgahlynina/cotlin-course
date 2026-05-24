package lessons.lesson15.homeworks.educationalEstablishments

class School(
    name: String,
    address: String,
    val subspecies: String
) : EducationalInstitution(name, address) {
    fun printSchoolType() {
        println("Это учебное заведение является школой вида: $subspecies")
    }
}