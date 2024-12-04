fun main(){
    SquareThreeSides()
}
fun SquareThreeSides() {
    val sc = java.util.Scanner(System.`in`)
    while (true){
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()
        if(a==0 && b==0 && c==0){
            break
        }
        if(a+b<=c || b+c<=a || c+a<=b) {
            println("Invalid")
        }else if(a==b && b==c){
            println("Equilateral")
        }else if(a==b||b==c||c==a){
            println("Isosceles")
        }else{
            println("Scalene")
        }
    }
}