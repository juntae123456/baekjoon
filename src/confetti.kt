import java.util.Scanner

fun main() {
    confetti()
}
fun confetti() {
    val sc = Scanner(System.`in`)
    val a= Array(100){ BooleanArray(100) }
    var count = 0
    repeat(sc.nextInt()){
        val x = sc.nextInt()
        val y = sc.nextInt()
        for(i in x until x + 10) {
            for (j in y until y + 10) {
                if (a[i][j]) continue
                a[i][j] = true
                count++
            }
        }
    }
    print(count)
}
