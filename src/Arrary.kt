fun main(){
    Arrary()
}
fun Arrary()= with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b = Array(a) { nextInt() }
    b.sort()
    repeat(a){
        println(b[it])
    }
}