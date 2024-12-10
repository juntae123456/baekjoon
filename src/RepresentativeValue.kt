fun main(){
    RepresentativeValue()
}
fun RepresentativeValue()=with(java.util.Scanner(System.`in`)){
    val b = Array(5) { nextInt() }
    b.sort()
    println(b.sum()/5)
    println(b[5/2])
}