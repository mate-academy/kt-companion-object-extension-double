package mate.academy

// provide your solution below

fun Double.Companion.printClassName() {
    print("Class name: ${this::class.qualifiedName}\n")
}
