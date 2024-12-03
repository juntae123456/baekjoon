fun main(){
    MultiplesDivisors()
}
fun MultiplesDivisors() {
    val sc = java.util.Scanner(System.`in`)
    while(true){
        val a = sc.nextInt()
        val b = sc.nextInt()
        if(a==0 && b==0){
            break
        }
        if(b%a==0){
            print("factor\n")
        }else if(a%b==0){
            print("multiple\n")
        }else{
            print("neither\n")
        }
    }
}