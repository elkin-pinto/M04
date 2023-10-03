import java.util.*

fun main() {
    var scan = Scanner(System.`in`)

    // Llegir quatre numero
    var numero = scan.nextInt()
    var numero2 = scan.nextInt()
    var numero3 = scan.nextInt()
    var numero4 = scan.nextInt()
    // Operar els numeros
    var operacio = (numero + numero2) * (numero3 % numero4)
    // Mostrar el resultat per pantalla
    println(operacio)
}