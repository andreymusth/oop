package creational.singleton

fun main(args: Array<String>) {

    ProgramLogger.getInstance().add("First log")
    ProgramLogger.getInstance().add("Second log")
    ProgramLogger.getInstance().add("Third log")

    ProgramLogger.getInstance().show()

}