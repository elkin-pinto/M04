import java.util.*

fun main() {
    // Primer definirem el scanner
    val scan = Scanner(System.`in`)
    var input = 10000001

    print("Introduce una fecha de nacimiento den formato ddmmaaaa: ")
    do {
        if(input >= 100000000 || input < 10000000) {
            println("No és una fecha valida.")
            print("Vuelve a intentarlo: ")
        }
        do {
        if (!scan.hasNextInt()) {
            println("No és una fecha valida.")
            print("Vuelve a intentarlo: ")
            scan.next()
        }
        } while (!scan.hasNextInt())
        input = scan.nextInt()
    }while (input >= 100000000 || input < 10000000)
    
    while(input > 9) {
        var suma_digitos = 0
        while (input != 0) {
            suma_digitos = suma_digitos + (input % 10)
            input = (input - (input % 10)) / 10
        }
        input = suma_digitos
    }
    print("Tu numero de la suerte és: $input")
}