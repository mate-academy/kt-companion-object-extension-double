package mate.academy

@Suppress("detekt:UtilityClassWithPublicConstructor")
class Double {
    companion object
}

fun Double.Companion.printClassName() {
    print("Class name: kotlin.Double.Companion\n")
}
