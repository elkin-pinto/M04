import java.util.*

fun main() {
    // Primer definirem el scanner
    val scan = Scanner(System.`in`)
    var costat1:Int = 0
    var costat2:Int = 0
    var costat3:Int = 0
    var boolean = true
    var ha_hecho_el_1 = false
    while (boolean == true) {
        println("Escoge una de las siguientes opciones: \n\n1- Comprobar si puede ser un triángulo.\n2- Comprobar si es triángulo rectangulo.\n3- Sarber que clase de triángulo és.\n4- Calcular perimetro y area.\n5- Salir\n")
        if (scan.hasNextInt()) {
            var input = scan.nextInt()
            if (input in 1..5){
                when (input) {
                    1 -> {
                        for (i in 1..3){
                            do {
                                if (input < 0) {
                                    println("Numero no valido")
                                }
                                do {
                                    print("Di un numero entero positivo: ")
                                    if (!scan.hasNextInt()) {
                                        println("Numero no valido")
                                        scan.next()
                                    }
                                } while (!scan.hasNextInt()) 
                                input = scan.nextInt()
                            }while(input < 0)
                                                          
                            when (i) {
                                1 -> costat1 = input
                                2 -> costat2 = input
                                3 -> costat3 = input
                            }
                        }
                        if (costat1 + costat2 > costat3 && costat2 + costat3 > costat1 && costat1 + costat3 > costat2) println("\n\nSí puede ser un triángulo.\n\n")
                        else println("\n\nNo puede ser un triángulo.\n\n")
                        ha_hecho_el_1 = true
                        }
                    
                    2 -> {  
                            if (ha_hecho_el_1 == true){
                                when {
                                    costat1 > costat2 && costat1 > costat3 && costat2*costat2 + costat3*costat3 == costat1*costat1 -> println("Sí és triángulo rectangulo.")                                   
                                    costat2 > costat1 && costat2 > costat3 && costat1*costat1 + costat3*costat3 == costat2*costat2 -> println("Sí és triángulo rectangulo.")
                                    costat3 > costat2 && costat3 > costat1 && costat1*costat1 + costat2*costat2 == costat3*costat3 -> println("Sí és triángulo rectangulo.")
                                    else -> println("No és triángulo rectangulo.")
                                }
                            }
                            else {
                                println("Has primero la opción 1 para establecer las medidas.")
                            }
                        }
                    3 -> {  
                            if (ha_hecho_el_1 == true){
                                when {
                                    costat1 == costat2 && costat1 == costat3 -> println("Tu triángulo és equilatero.")
                                    costat1 == costat2 || costat1 == costat3 || costat2 == costat3 -> println("Tu triángulo és isóseles.")
                                    costat1 != costat2 && costat1 != costat3 && costat2 != costat3 -> println("Tu triángulo és escaleno.")
                                }
                            }
                            else {
                                println("Has primero la opción 1 para establecer las medidas.")
                            }
                        }
                    4 -> boolean = false
                    5 -> boolean = false
                }
            }
        
            else {
            var error = scan.nextLine()
            println(error + " no es una opcion valida...\n\nVuelve a intentarlo.")
            }
        }
        else {
            var error = scan.nextLine()
            println(error + " no es una opcion valida...\n\nVuelve a intentarlo.")
        }
    } 
}