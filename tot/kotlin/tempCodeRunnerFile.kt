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
    var numero_a_cambiar = scan.nextInt()
    for (i in matriu.indices) {
        for (e in 0..Narray - 1){
            if (numero_a_cambiar == matriu[i][e]) print("$numero_a_cambiar ")
            else print("${matriu[i][e]} ")
        }
    }
}