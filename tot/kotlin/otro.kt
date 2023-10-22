import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    val caga = "caga"
    
    for (i in 1..vueltas) {
        var caga_tio = ""
        var verso = scan.nextInt()
        for (x in 1..if (verso % 2 == 0) {(verso/2)-1} ;else {verso/2})    {
            caga_tio = caga_tio +  caga
        }
        println("Caga " + caga_tio + "tio!")
        }
}