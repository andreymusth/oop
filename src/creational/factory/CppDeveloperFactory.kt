package creational.factory

class CppDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer {
        return CppDeveloper()
    }
}