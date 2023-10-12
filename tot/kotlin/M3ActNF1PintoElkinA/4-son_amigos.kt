import java.util.*

fun main() {
    // Primer definirem el scanner
    val scan = Scanner(System.`in`)
    var input = 2
    var es_primo = true
    var x:Int
    var suma_primos_1 = 0
    var suma_primos_2 = 0
     
    for (i in 1..2) {
        // hacemos un bucle que solo se haga dos veces y comprovamos que nos den valores validos. 
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
        } while (!scan.hasNextInt()) 
        input = scan.nextInt()
        }while(input < 0)
        // Hacemos que cada numero menor al imput compruebe que es imput, y si lo és lo sumara a una variable dependiendo de que numero de vuelta sea.
        for (numero_primo in 2..(input-1)) {
            x = 0
            while (x < (input / 2)) {
                x++
                es_primo = true
                if (numero_primo % x == 0 && x != 1){
                    es_primo = false
                }
            }
            if (es_primo == true) {
                when (i) {
                    1 -> suma_primos_1 = suma_primos_1 + numero_primo
                    2 -> suma_primos_2 = suma_primos_2 + numero_primo
                }
            } 
        }
    }
    // Mostramos los resultados.
    print("Los numeros introducidos ")
    if (suma_primos_1 == suma_primos_2) {
        println("sí son amigos")
    }
    else {
        println("no son amigos")
    }  
}