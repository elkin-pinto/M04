import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    // Busquem els valors
    var segons = scan.nextInt()
    // operem els valors
    var segons_final = (segons + 1) % 60
    // Mostrem resultat
    println(segons_final)
}