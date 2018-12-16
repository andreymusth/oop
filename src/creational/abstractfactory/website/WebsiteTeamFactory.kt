package creational.abstractfactory.website

import creational.abstractfactory.Developer
import creational.abstractfactory.ProjectManager
import creational.abstractfactory.ProjectTeamFactory
import creational.abstractfactory.Tester

class WebsiteTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return PhpDeveloper()
    }

    override fun getTester(): Tester {
        return ManualTester()
    }

    override fun getProjectManager(): ProjectManager {
        return WebsiteProjectManager()
    }
}