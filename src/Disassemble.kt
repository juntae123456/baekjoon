fun main(){
    Disassemble()
}
fun Disassemble() {
    val sc = java.util.Scanner(System.`in`)
    val target = sc.nextInt()

    val start = maxOf(1, target - target.toString().length * 9) // 1부터 시작하거나, target - 9 * 자릿수 만큼 시작
    var constructor = 0

    for (i in start until target) {
        val digitSum = i.toString().map { it - '0' }.sum() // 각 자리수의 합
        if (i + digitSum == target) {
            constructor = i
            break
        }
    }


    if (constructor != 0) {
        println(constructor)
    } else {
        println("0")
    }
}