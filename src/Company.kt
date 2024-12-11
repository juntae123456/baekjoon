fun main(){
    Company()
}
fun Company(){
    val n = readLine()!!.toInt()
    val log = mutableSetOf<String>()
    repeat(n) {
        val (name, action) = readLine()!!.split(" ")
        if (action == "enter") {
            log.add(name)
        } else if (action == "leave") {
            log.remove(name)
        }
    }

    log.sortedDescending().forEach { println(it) }
}