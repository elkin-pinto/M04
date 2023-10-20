import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var frase:String ?= null
    while (frase == "FIN"){
        frase = scan.nextLine()
        var exclamaciones_abiertas = 0
        var exclamaciones_cerradas = 0
        for (x in frase) {
            when (x) {
                '¡' -> exclamaciones_abiertas++
                '!' -> exclamaciones_cerradas++
            }
        }
        if (exclamaciones_abiertas != exclamaciones_cerradas) {
            println("NO")
        }
        else if (exclamaciones_abiertas == exclamaciones_cerradas){
            println("SI")
        }
    }
}