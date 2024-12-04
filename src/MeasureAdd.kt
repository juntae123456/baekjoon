fun main(){
    MeasureAdd()
}
fun MeasureAdd() {
    val sc=java.util.Scanner(System.`in`)
    while(true){
        val a=sc.nextInt()
        val arr = mutableListOf<Int>()
        if(a==-1){
            break
        }
        for (i in 1..a) {
            if(a%i==0) {
                arr.add(i)
            }
        }
        arr.remove(a)
        if(arr.sum()==a){
            println("$a = ${arr.joinToString(" + ")}")
        }else{
            println("$a is NOT perfect.")
        }
    }
}