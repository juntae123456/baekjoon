fun main() {
    MathNonToNonFaceLearning()
}

fun MathNonToNonFaceLearning() {
    val sc = java.util.Scanner(System.`in`)
    val a = Array(3) { sc.nextInt() }
    val b = Array(3) { sc.nextInt() }


    val denominator = a[0] * b[1] - b[0] * a[1]


    val x = (a[2] * b[1] - b[2] * a[1]) / denominator
    val y = (a[0] * b[2] - b[0] * a[2]) / denominator

    println("$x $y")
}