package creational.abstractfactory

import creational.abstractfactory.banking.BankingTeamFactory

fun main(args: Array<String>) {
    val projectTeamFactory = BankingTeamFactory()

    val dev = projectTeamFactory.getDeveloper()
    val test = projectTeamFactory.getTester()
    val pm = projectTeamFactory.getProjectManager()

    dev.writeCode()
    test.testCode()
    pm.manageProject()
}