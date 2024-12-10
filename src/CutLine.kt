fun main(){
    CutLine()
}
fun CutLine()= with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()
    val arr = Array(a) { nextInt() }
    arr.sortDescending()
    println(arr[b-1])
}