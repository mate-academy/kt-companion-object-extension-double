package mate.academy

fun Double.Companion.printClassName(){
    println("Class name: ${Double.Companion::class.qualifiedName}")
}

fun main() {
    println(Double.printClassName())
}
