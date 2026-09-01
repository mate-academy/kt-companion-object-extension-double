package mate.academy

const val DOUBLE_MESSAGE_FROM_PRINT: String
= "Class name: kotlin.Double.Companion\n"

fun Double.Companion.printClassName() {
    print(DOUBLE_MESSAGE_FROM_PRINT)
}
