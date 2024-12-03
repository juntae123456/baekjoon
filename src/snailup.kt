fun main(){
    snailup()
}
fun snailup() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val v = sc.nextInt()
    var day = (v - b) / (a - b)
    if ((v - b) % (a - b) != 0) {
        day++
    }
    print(day)
}