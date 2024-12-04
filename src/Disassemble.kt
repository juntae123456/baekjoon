fun main(){
    Disassemble()
}
fun Disassemble() {
    val sc = java.util.Scanner(System.`in`)
    val target = sc.nextInt()

    val start = maxOf(1, target - target.toString().length * 9)
    var constructor = 0

    for (n in start until target) {
        val digitSum = n.toString().map { it - '0' }.sum()
        if (n + digitSum == target) {
            constructor = n
            break
        }
    }


    if (constructor != 0) {
        println(constructor)
    } else {
        println("0")
    }
}