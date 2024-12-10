import java.io.BufferedReader
import java.io.BufferedWriter

fun main(){
    Arrary2()
}
fun Arrary2() {
    val rd = BufferedReader(System.`in`.reader())
    val wt = BufferedWriter(System.`out`.writer())
    val a = rd.readLine().toInt()
    val b = MutableList(a) { rd.readLine().toInt() }
    java.util.Collections.sort(b)
    for (i in 0 until a) {
        wt.write("${b[i]}\n")
        wt.flush()
    }
    wt.close()
}