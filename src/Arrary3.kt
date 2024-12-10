import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.Collections

fun main(){
    Arrary3()
}
fun Arrary3() {
    val rd = BufferedReader(System.`in`.reader())
    val wt = BufferedWriter(System.`out`.writer())
    val a = rd.readLine().toInt()
    val b = IntArray(a,{rd.readLine().toInt()})
    b.sort()
    b.forEach { wt.write("$it\n") }
    wt.flush()
    wt.close()
}
