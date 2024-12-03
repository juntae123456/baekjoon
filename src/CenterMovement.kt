import java.util.Scanner

fun main() {
    CenterMovement()
}
fun CenterMovement(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var result = 2
    repeat(n){
        result=result*2-1
    }
    print(result*result)
}