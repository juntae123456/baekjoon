import java.util.Scanner
fun main() {
    honeycomb()
}
fun honeycomb() {
    val sc=Scanner(System.`in`)
    val n=sc.nextInt()
    var i=1
    var sum=1
    while(sum<n){
        sum+=6*i
        i++
    }
    print(i)
}