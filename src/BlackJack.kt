fun main(){
    BlackJack()
}
fun BlackJack() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val arr = IntArray(a)
    for(i in 0 until a){
        arr[i] = sc.nextInt()
    }
    var max = 0
    for(i in 0 until a-2){
        for(j in i+1 until a-1){
            for(k in j+1 until a){
                val sum = arr[i]+arr[j]+arr[k]
                if(sum in (max+1)..b){
                    max = sum
                }
            }
        }
    }
    println(max)
}