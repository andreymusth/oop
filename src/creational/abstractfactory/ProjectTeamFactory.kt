package creational.abstractfactory

interface ProjectTeamFactory {
    fun getDeveloper(): Developer
    fun getTester(): Tester
    fun getProjectManager(): ProjectManager
}