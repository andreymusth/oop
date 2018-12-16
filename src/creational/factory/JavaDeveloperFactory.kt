package creational.factory

class JavaDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer {
        return JavaDeveloper()
    }
}