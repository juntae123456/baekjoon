import java.util.*

fun main() {
    laundry()
}
fun laundry(){
    val sc = Scanner(System.`in`)
    val Quarter = 25
    val Dime = 10
    val Nickel = 5
    val Penny = 1
    repeat(sc.nextInt()){
        var money = sc.nextInt()
        var quarter = 0
        var dime = 0
        var nickel = 0
        var penny = 0

        quarter = money / Quarter
        money %= Quarter
        dime = money / Dime
        money %= Dime
        nickel = money / Nickel
        money %= Nickel
        penny = money / Penny
        print("$quarter $dime $nickel $penny\n")
    }
}