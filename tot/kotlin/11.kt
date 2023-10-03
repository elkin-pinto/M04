import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    // Buscar los valores
    var llargada = scan.nextFloat()
    var amplada = scan.nextFloat()
    var altura = scan.nextFloat()
    // Calcular volum aula
    var volum = (amplada * llargada * altura)
    // Mostrar els resultats
    println(volum)
}