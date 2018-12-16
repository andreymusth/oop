package creational.abstractfactory.website

import creational.abstractfactory.Developer

class PhpDeveloper : Developer {

    override fun writeCode() {
        println("PHP developer writes PHP code...")
    }
}