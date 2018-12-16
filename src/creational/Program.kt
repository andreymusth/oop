package creational

import creational.factory.*

fun main(args: Array<String>) {
    val factory: DeveloperFactory = createDeveloperBySpeciality("php")
    val developer = factory.createDeveloper()
    developer.writeCode()
}