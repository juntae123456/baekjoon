fun main(){
    PrimeFactorization()
}
fun PrimeFactorization() {
    val sc = java.util.Scanner(System.`in`)
    var n = sc.nextInt()
    var i = 2
    if(n==1){
        return
    }
    while (n != 1) {
        if (n % i == 0) {
            println(i)
            n /= i
        } else {
            i++
        }

    }
}