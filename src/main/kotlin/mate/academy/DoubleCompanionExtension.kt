package mate.academy
const val MESSAGE: String = "Class name: "
fun Double.Companion.printClassName() {
    println(MESSAGE + this::class.qualifiedName)
}
