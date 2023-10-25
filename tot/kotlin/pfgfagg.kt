import java.util.*

fun main() {
    // primero pediremos los datos al usuario
    val scan = Scanner(System.`in`)
    var input = scan.nextLine()
    // con los datos cogidos los separaremos y los meteremos a una lista
    var lista = input.split(" ")
    // ya en una lista los haremos los calculos y comprobaciones
    var experiencia = lista[1].toLongOrNull()
    var jugador = lista[0]
    var grupo = lista[2]
    if (experiencia != null) {
        if (experiencia > -1L) {
        when (grupo) {
        "A" -> experiencia += 50L
        "B" -> experiencia += 20L
        "C" -> experiencia += 10L
        else -> println("ERROR")
        }
        if (grupo == "A" || grupo == "B" || grupo == "C") {
            println("Jugador: $jugador - Grup: $grupo - Punts totals: $experiencia")
        }
        
        }
        else println("ERROR")
    }
    else println("ERROR")
}