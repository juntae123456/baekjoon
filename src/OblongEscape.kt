fun main(){
    OblongEscape()
}
fun OblongEscape() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val arr = mutableListOf<Int>()
    arr.add(a)
    arr.add(b)
    arr.add(c-a)
    arr.add(d-b)
    println(arr.min())
}