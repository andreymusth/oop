package creational.factory

interface DeveloperFactory {
    fun createDeveloper(): Developer
}

fun createDeveloperBySpeciality(speciality: String): DeveloperFactory {

    return when (speciality) {
        "java" -> JavaDeveloperFactory()
        "c++" -> CppDeveloperFactory()
        "php" -> PhpDeveloperFactory()
        else -> {
            throw RuntimeException("$speciality is unknown")
        }
    }

}