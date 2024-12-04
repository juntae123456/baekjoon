fun main(){
    DecimalFind()
}
fun DecimalFind() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val arr = mutableListOf<Int>()
    var count = 0
    repeat(a){
        arr.add(sc.nextInt())
    }
    for(i in 0 until a){
        val arr2 = mutableListOf<Int>()
        if(arr[i]==1){
            continue
        }
        for (j in 1..arr[i]) {
            if(arr[i]%j==0) {
                arr2.add(j)
            }
        }
        if(arr2.size==2){
            count++
        }
    }
    println(count)
}
