import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var Nmatriu = scan.nextInt()
    var Narray = scan.nextInt()
    var matriu = Array(Nmatriu) {Array(Narray) {0}}


    for (i in matriu.indices) {
        for (e in 0..Narray - 1){
            matriu[i][e] = scan.nextInt()
        }
    }
    var numero_a_comprobar = scan.nextInt()
    var suma_fila = 0
    var suma_columna = 0
    var respuesta = "-1 -1"
    for (i in matriu.indices) {
        for (e in 0..Narray - 1){
            if (e == numero_a_comprobar) suma_columna += matriu[i][e]
            if (i == numero_a_comprobar) suma_fila += matriu[i][e]
        }
    }
    println("$suma_fila $suma_columna")
}