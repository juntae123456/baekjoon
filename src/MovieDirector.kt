import java.util.Scanner

fun main(){
    MovieDirector()
}
fun MovieDirector()= with(Scanner(System.`in`)){
    var a = nextLine()
    var b: Long = 0
    while(true){
        b++
        if(b.toString().contains("666")){
            if(a.toInt()==1){
                println(b)
                break
            }
            a = (a.toInt() - 1).toString()
        }
    }
}