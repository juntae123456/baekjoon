fun main(){
    Algorithm2()
}
fun Algorithm2() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    var count = 0
    var sum = 0
    for(i in 1 .. a){
        count++
        if(i==a){
            sum++
        }
    }
    println(count)
    println(sum)
}