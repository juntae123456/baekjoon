fun main(){
    Algorithm4()
}
fun Algorithm4() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextLong()
    var b: Long = 0
    for(i in 1 until  a){
        b+=a-i
    }
    println(b)
    println("2")
}