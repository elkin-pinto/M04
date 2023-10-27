import java.util.*

fun main() {
    var scan = Scanner(System.`in`)

    var input = scan.nextInt()
    scan.nextLine()
    var numeros = scan.nextLine()
    var posicio = scan.next()
    var numeros_lista = numeros.split(" ").toTypedArray()
    for (i in 0..(numeros_lista.size - 1)) {
        if (i < input ) {
            if (posicio.toInt() == i) {
                posicio = numeros_lista[i]
            } 
            print(numeros_lista[i])
            print(" ")
        }   
    }
    print("\n$posicio\n")
    
}