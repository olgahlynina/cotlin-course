package lessons.lesson15.homeworks.educationalEstablishments

open class EducationalInstitution(
    val name: String,
    val address: String
) {
    fun getFullCard(): String {
        return "Учебное заведение: '$name' по адресу: $address"
    }
}