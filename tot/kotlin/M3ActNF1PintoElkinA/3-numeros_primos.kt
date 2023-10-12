import java.util.*

fun main() {
    // Primer definirem el scanner
    val scan = Scanner(System.`in`)
    var input = 2
    var es_primo = true
    var x = 0
    var proximo_es_primo = false
    // Comrpobamos que nos da un numero entero positivo.
    do {
        if (input < 2) {
            println("Número no valido")
        }
        print("Di un número entero positivo: ")
        do {
            
            if (!scan.hasNextInt()) {
                println("Valor no valido")
                print("Di un número entero positivo: ")
                scan.next()
            }
        }while (!scan.hasNextInt()) 
        input = scan.nextInt()
    }while(input < 0)
    var proximo_n_primo = input
    // Diremos si es primo el numero que nos dio dividiendolo por cada numero menos que el hasta que supere su mitatd
    while (x < (input / 2)) {
        x++
        if (input % x == 0 && x != 1){
            es_primo = false
        }
    }
    // Con la misma idea de antes haremos lo mismo, solo que no parara hasta encontrar un numero que sea primo. 
    while (proximo_es_primo == false) {
        proximo_n_primo++
        proximo_es_primo = true
        x = 0
        while(x < (proximo_n_primo / 2)){
             x++
            if (proximo_n_primo % x == 0 && x != 1){
              proximo_es_primo = false
            }
        }
    }
    //  Damos los resultados
    if (es_primo) {
        println("$input no és primo.\n\n El proximo numero primo a $input és $proximo_n_primo")
    }
    else {
        println("$input no és primo.\n\n El proximo numero primo a $input és $proximo_n_primo")
    }
    
}