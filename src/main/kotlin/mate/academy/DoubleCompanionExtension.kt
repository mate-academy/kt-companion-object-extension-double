package mate.academy

// provide your solution below
fun Double.Companion.printClassName() {
    println("Class name: ${this::class.qualifiedName}")
}
