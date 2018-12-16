package creational.abstractfactory.banking

import creational.abstractfactory.Developer
import creational.abstractfactory.ProjectManager
import creational.abstractfactory.ProjectTeamFactory
import creational.abstractfactory.Tester

class BankingTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return JavaDeveloper()
    }

    override fun getTester(): Tester {
        return QaTester()
    }

    override fun getProjectManager(): ProjectManager {
        return BankingProjectManager()
    }
}