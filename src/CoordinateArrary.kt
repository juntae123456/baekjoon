fun main(){
    CoordinateArrary()
}
fun CoordinateArrary()=with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b = Array(a){IntArray(2){nextInt()}}
    b.sortWith(compareBy({it[0]},{it[1]}))
    repeat(a){
        println("${b[it][0]} ${b[it][1]}")
    }
}