package mate.academy

fun Double.Companion.printClassName() {
    print("Class name: ${Double::class.qualifiedName}.Companion\n")
}
