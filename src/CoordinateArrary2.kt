fun main(){
    CoordinateArrary2()
}
fun CoordinateArrary2()=with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b = Array(a){IntArray(2){nextInt()}}
    b.sortWith(compareBy({it[1]},{it[0]}))
    repeat(a){
        println("${b[it][0]} ${b[it][1]}")
    }
}