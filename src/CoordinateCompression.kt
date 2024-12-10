import java.io.BufferedReader
import java.io.BufferedWriter

fun main(){
    CoordinateCompression()
}
fun CoordinateCompression(){
    val rd = BufferedReader(System.`in`.reader())
    val wr = BufferedWriter(System.`out`.writer())
    val a = rd.readLine().toInt()
    val b = rd.readLine().split(" ").map { it.toInt() }.toMutableList()
    val c = b.sorted().distinct()
    val map = c.withIndex().associate { it.value to it.index }
    for(i in 0 until a){
        wr.write("${map[b[i]]} ")
    }
                wr.flush()
    wr.close()
}


