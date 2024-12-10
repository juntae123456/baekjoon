import java.io.BufferedReader
import java.io.BufferedWriter

fun main(){
    NumberCard()
}
fun NumberCard() {
    val rd = BufferedReader(System.`in`.reader())
    val wr = BufferedWriter(System.`out`.writer())
    val n = rd.readLine().toInt()
    val nList = rd.readLine().split(" ").map { it.toInt() }
    val m = rd.readLine().toInt()
    val mList = rd.readLine().split(" ").map { it.toInt() }
    val nMap = mutableMapOf<Int, Int>()
    nList.forEach {
        nMap[it] = nMap.getOrDefault(it, 0) + 1
    }
    val result = mutableListOf<Int>()
    mList.forEach {
        result.add(nMap.getOrDefault(it, 0))
    }
    wr.write(result.joinToString(" "))
    wr.flush()
    wr.close()
}