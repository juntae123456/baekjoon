import java.util.Scanner

fun main() {
    BaseConversion2()
}

fun BaseConversion2() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    val b = sc.nextInt()
    val result = mutableListOf<Char>()

    while (a != 0) {
        val count = a % b
        a /= b

        if (count < 10) {
            result.add('0' + count)
        } else {
            result.add('A' + (count - 10))
        }
    }

    println(result.reversed().joinToString(""))
}