fun main() {
    VerticalReading()
}

fun VerticalReading() {
    val input = Array(5) { readln() }
    val maxLength = input.maxOf { it.length }

    for (i in 0 until maxLength) {
        for (j in 0..<5) {
            if (i < input[j].length) {
                print(input[j][i])
            }
        }
    }
}