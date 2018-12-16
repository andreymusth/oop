package creational.abstractfactory

import creational.abstractfactory.website.WebsiteTeamFactory

fun main(args: Array<String>) {
    val projectTeamFactory = WebsiteTeamFactory()

    val dev = projectTeamFactory.getDeveloper()
    val test = projectTeamFactory.getTester()
    val pm = projectTeamFactory.getProjectManager()

    dev.writeCode()
    test.testCode()
    pm.manageProject()
}