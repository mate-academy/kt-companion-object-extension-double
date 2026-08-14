package mate.academy

fun Double.Companion.printClassName() {
    print("Class name: kotlin.Double.Companion\n")
}

fun main() {
    // Виклик через Companion явно
    Double.Companion.printClassName()

    // Або скорочено (Kotlin дозволяє пропускати слово Companion)
    Double.printClassName()
}
