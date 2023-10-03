import java.util.*

fun main() {
    var scan = Scanner(System.`in`)

    // Llegir quatre numero
    var numero = scan.nextInt()
    var numero2 = scan.nextInt()
    var numero3 = scan.nextInt()
    // Operar els numeros
    var operacio = (numero % 2 + numero2 % 2 + numero3 % 2) + (numero / 2 + numero2 / 2  + numero3 / 2)
    // Mostrar el resultat per pantalla
    println(operacio)


}