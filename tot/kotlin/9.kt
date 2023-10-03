import java.util.*

fun main() {
    var scan = Scanner(System.`in`)

    // Llegir els valors
    var preu_anterior = scan.nextInt()
    var preu_posterior = scan.nextInt()
 
    // calcular el descompte
    var preu_final = 100 / (preu_anterior / (preu_anterior - preu_posterior)) 
    // Mostrar el resultat per pantalla
    println(preu_final)
}
