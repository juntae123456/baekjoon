import java.util.*

fun main(){
    Measure()
}
fun Measure() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val arr = mutableListOf<Int>()
    for (i in 1..n) {
        if(n%i==0) {
            arr.add(i)
        }
    }
    arr.sort()
    if (m > arr.size) {
        println("0")
    } else {
        println(arr[m - 1])
    }
}