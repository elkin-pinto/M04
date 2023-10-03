import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    // Busquem els valors
    var celsius = scan.nextFloat()
    // Fem els calculs
    var fahrenheit = celsius * 9  / 5 + 32
    // Mostrar resultados
    println(fahrenheit)
}