fun main(){
    AgeArray()
}
fun AgeArray()= with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b = Array(a){Array(2){next()}}
    b.sortWith(compareBy({it[0].toInt()}))
    repeat(a){
        println("${b[it][0]} ${b[it][1]}")
    }
}