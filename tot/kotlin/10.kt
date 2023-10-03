import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    // Buscar los valores
    var pizza = scan.nextFloat()
    // Calcular superficie pizza
    var s_pizza = ((pizza *pizza) * Math.PI) / 4
    // Mostrar el resultat per pantalla
    println(s_pizza)
}