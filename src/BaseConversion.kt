import java.util.Scanner
import kotlin.math.pow

fun main() {
    BaseConversion()
}

fun BaseConversion() {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.nextInt()
    var result = 0

    for (i in a.indices) {
        val c = if (a[i] in 'A'..'Z') {
            a[i] - 'A' + 10
        } else {
            a[i] - '0'
        }

        val power = (a.length - 1 - i).toDouble()
        result += c * b.toDouble().pow(power).toInt()
    }
    println(result)
}