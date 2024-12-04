fun main(){
    Triangle()
}
fun Triangle() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val sum = a+b+c
    if(sum==180) {
        if(a==b && b==c){
            println("Equilateral")
        }else if(a==b || b==c || c==a){
            println("Isosceles")
        }else{
            println("Scalene")
        }
    }
    else{
        println("Error")
    }
}