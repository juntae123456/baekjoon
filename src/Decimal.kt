fun main(){
    Decimal()
}
fun Decimal() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val arr = mutableListOf<Int>()
    for(i in a.. b){
        val arr2 = mutableListOf<Int>()
        for (j in 1..i) {
            if(i%j==0) {
                arr2.add(j)
            }
        }
        if(arr2.size==2){
            arr.add(i)
        }
    }
    if(arr.size==0){
        println("-1")
    }else{
        println(arr.sum())
        println(arr.min())
    }
}