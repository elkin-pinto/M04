import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    // Busquem els valors
    var graus_al_aula = scan.nextFloat()
    var augment_graus = scan.nextFloat()
    // Operar els valors
    var graus_finals = graus_al_aula + augment_graus
    // Mostrem els resustats
    print("La temperatura actual és $graus_finals" )
    println("°")
}
