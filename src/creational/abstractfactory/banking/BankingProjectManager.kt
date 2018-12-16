package creational.abstractfactory.banking

import creational.abstractfactory.ProjectManager

class BankingProjectManager : ProjectManager {
    override fun manageProject() {
        println("PM manages banking project...")
    }
}