import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    
    repeat(vueltas) {
        var casos = scan.nextInt()
        scan.nextLine()
        var arrayStrings = arrayOf<String>()
        repeat(casos - 1) {arrayStrings += scan.nextLine()}
        var caso_a_comprobar = scan.nextLine()
        if (caso_a_comprobar in arrayStrings) println("SI")
        else println("NO")
    }
} 
