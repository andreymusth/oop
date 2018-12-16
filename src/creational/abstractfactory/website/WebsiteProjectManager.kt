package creational.abstractfactory.website

import creational.abstractfactory.ProjectManager

class WebsiteProjectManager : ProjectManager {
    override fun manageProject() {
        println("PM manages web site project...")
    }
}