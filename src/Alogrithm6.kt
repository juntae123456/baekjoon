fun main(){
    Alogrithm6()
}
fun Alogrithm6() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextLong()
    var b: Long = 0
    for(i in 1 until a-1){
        b+=(a-i-1)*(a-i)/2
    }
    println(b)
    println("3")

}