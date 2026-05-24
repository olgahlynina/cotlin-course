package lessons.lesson15.homeworks.educationalEstablishments

open class University (
    name: String,
    address: String,
    val facultiesCount: Int
) : EducationalInstitution(name, address) {
    fun printFacultiesInfo() {
        println("В университете '$name' открыто $facultiesCount факультетов.")
    }
}