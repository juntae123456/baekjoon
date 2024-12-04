fun main() {
    ThreeSticks()
}
fun ThreeSticks() {
    val sc = java.util.Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val sticks = listOf(a, b, c).sorted().toMutableList()
    var (x, y, z) = sticks

    if (x + y <= z) {
        z = x + y - 1
    }

    println(x + y + z)
}
