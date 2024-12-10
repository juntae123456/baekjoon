fun main(){
    WordArray()
}
fun WordArray()= with(java.util.Scanner(System.`in`)){
    val a = nextInt()
    val b =  mutableListOf<String>()
    repeat(a){
        b.add(next())
    }
    b.sortWith(compareBy({it.length},{it}))
    b.distinct().forEach{
        println(it)
    }
}