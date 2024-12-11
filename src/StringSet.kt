import java.io.BufferedReader
import java.io.BufferedWriter

fun main(){
    StringSet()
}
fun StringSet() {
    val rd = BufferedReader(System.`in`.reader())
    val wr = BufferedWriter(System.out.writer())
    val (n, m) = rd.readLine().split(" ").map { it.toInt() }
    val nSet = mutableSetOf<String>()
    repeat(n){
        nSet.add(rd.readLine().trim().lowercase())
    }
    val mSet = mutableListOf<String>()
    repeat(m){
        mSet.add(rd.readLine().trim().lowercase())
    }
    val result = mSet.count { it in nSet }
    wr.write(result.toString() + "\n")
    wr.flush()
    wr.close()
}