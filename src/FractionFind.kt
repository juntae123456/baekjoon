import java.util.*

fun main(){
    FractionFind()
}
fun FractionFind() {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    var i = 1
    var sum = 0
    while (true) {
        sum += i
        if (sum >= x) {
            break
        }
        i++
    }
    val diff = sum - x
    if (i % 2 == 0) {
        print("${i - diff}/${1 + diff}")
    } else {
        print("${1 + diff}/${i - diff}")
    }
}