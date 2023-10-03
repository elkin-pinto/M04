import java.util.*

fun main() {
    var scan = Scanner(System.`in`)

    // Llegir el numero de començals i el preu del dinar
    var comensals = scan.nextInt()
    var preu_dinar = scan.nextFloat()
 
    // fer el calcul del preu per persona
    var preu_final = preu_dinar / comensals
    // Mostrar el resultat per pantalla
    print(preu_final)
    println("€")
}
