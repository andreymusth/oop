package structural.delegate

fun main(args: Array<String>) {


    val painter = Painter()
    painter.graphics = Square()

    painter.draw()

    painter.graphics = Triangle()

    painter.draw()

}