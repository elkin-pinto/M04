import java.util.*

fun main() {
    val scan= Scanner(System.`in`)
    val numero:Int
    print("Introduce un número: ")
    do {
        if (!scan.hasNextInt()) {
            print("Eso no es un entero. Vuelve a intentarlo: ")
            scan.next()
        }
    } while ( !scan.hasNextInt() )
    numero = scan.nextInt()

    println("El numero introducido ha sido el $numero")
}