fun main(){
    FourDot()
}
fun FourDot() {
    val sc = java.util.Scanner(System.`in`)
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    val arr3 = mutableListOf<Int>()
    val arr4 = mutableListOf<Int>()
    for (i in 0 until 3) {
        when (i) {
            0 -> {
                arr1.add(sc.nextInt())
                arr1.add(sc.nextInt())
            }
            1 -> {
                arr2.add(sc.nextInt())
                arr2.add(sc.nextInt())
            }
            2 -> {
                arr3.add(sc.nextInt())
                arr3.add(sc.nextInt())
            }
        }
    }
    if (arr1[0] == arr2[0]) {
        arr4.add(arr3[0])
    } else if (arr1[0] == arr3[0]) {
        arr4.add(arr2[0])
    } else {
        arr4.add(arr1[0])
    }
    if (arr1[1] == arr2[1]) {
        arr4.add(arr3[1])
    } else if (arr1[1] == arr3[1]) {
        arr4.add(arr2[1])
    } else {
        arr4.add(arr1[1])
    }
    println(arr4.joinToString(" "))
}