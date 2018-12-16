package delegate

class Painter {

    var graphics: Graphics? = null

    fun draw() {
        graphics?.draw()
    }
}