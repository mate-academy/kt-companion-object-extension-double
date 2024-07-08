package mate.academy

fun Double.Companion.printClassName() {
    val className = this::class.qualifiedName
    print("Class name: $className\n")
}
