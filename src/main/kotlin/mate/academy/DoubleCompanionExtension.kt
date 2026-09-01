package mate.academy

fun Double.Companion.printClassName() {
    println("Class name: kotlin.${Double::class.simpleName}.Companion")
}

fun main() {
    Double.printClassName()
}

