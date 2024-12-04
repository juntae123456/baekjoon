fun main(){
    Algorithm7()
}
fun Algorithm7() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    if(a*d+b<=c*d&&a<=c){
        println("1")
    }else{
        println("0")
    }
}