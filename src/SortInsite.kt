fun main(){
    SortInsite()
}
fun SortInsite()= with(java.util.Scanner(System.`in`)){
    val a = nextLine()
    val b = Array(a.length) { a[it].toString().toInt() }
    b.sortDescending()
    repeat(a.length){
        print(b[it])
    }
}