fun main(){
    earth()
}
fun earth() {
    val sc = java.util.Scanner(System.`in`)
    val n = sc.nextInt()
    var max1 = sc.nextInt()
    var max2 = sc.nextInt()
    var min1 = max1
    var min2 = max2
    if(n==1){
        println("0")
        return
    }
    repeat(n-1) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        if (a > max1) {
            max1 = a
        }
        if (b > max2) {
            max2 = b
        }
        if (a < min1) {
            min1 = a
        }
        if (b < min2) {
            min2 = b
        }
    }
    if((max1==min1) && (max2==min2)){
        println("0")
    }else{
        println((max1-min1)*(max2-min2))
    }
}