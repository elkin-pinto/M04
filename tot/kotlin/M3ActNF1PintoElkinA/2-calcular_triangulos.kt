import java.util.*
import kotlin.math.*

fun main() {
    // Primer definirem el scanner
    val scan = Scanner(System.`in`)
    var costat1:Int = 0
    var costat2:Int = 0
    var costat3:Int = 0
    var boolean = true
    var ha_hecho_el_1 = false
    //Haremos un bucle que se repetira hasta que le digamos que pare.
    while (boolean == true) {
        println("Escoge una de las siguientes opciones: \n\n1- Comprobar si puede ser un triángulo.\n2- Comprobar si es triángulo rectangulo.\n3- Sarber que clase de triángulo és.\n4- Calcular perimetro y area.\n5- Salir\n")
        // le diremos al usuario las opciones y después le validaremos los datos con un if.
        if (scan.hasNextInt()) {
            // ya sabiendo que es un numero lo validaremos otra vez para comrpovar que seu una de las opciones 1..5
            var input = scan.nextInt()
            if (input in 1..5){
                // ya validadas las opciones haremos respectivamente la opcion que haga el usuario, aunque la opcion 1 siempre se tendra que hacer como primera opcion.
                when (input) {
                    1 -> {
                        // validamos otra vez los datos con un do while doble para que sea un numero entero positivo, y con el bucle for haremos que se repita 3 veces para guardarlo en tres variables distintas usando la iteracion i.
                        for (i in 1..3){
                            do {
                                if (input < 0) {
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
                                                          
                            when (i) {
                                1 -> costat1 = input
                                2 -> costat2 = input
                                3 -> costat3 = input
                            }
                        }
                        // Con unas simples operaciones sabremos si puede ser tirangulo o no y le diremos al usuario los resultados, después marcaremos una variable para decir que el usuario ya ha hecho la opcion 1.
                        if (costat1 + costat2 > costat3 && costat2 + costat3 > costat1 && costat1 + costat3 > costat2) println("\n\nSí puede ser un triángulo.\n\n")
                        else println("\n\nNo puede ser un triángulo.\n\n")
                        ha_hecho_el_1 = true
                        }
                    
                    2 -> {  
                            if (ha_hecho_el_1 == true){
                                // En la opción 2 haremos la regla de pitagoras para saber si es un rectangulo.
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
                                // Con comparaciones entre los diferentes lados del triangulo le daremos un resutado distinto.
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
                    4 -> if (ha_hecho_el_1 == true){
                            // Creamos nuevas variables para que sean double y asi poder usar la operacion sqrt con math, y asi poder calcular el perimetro y el area.
                                var costat1_double = costat1.toDouble()
                                var costat2_double = costat2.toDouble()
                                var costat3_double = costat3.toDouble()
                                var s:Double = (costat1_double + costat2_double + costat3_double) / 2
                                println("El perimetro és: " +  (costat1 + costat2 + costat3) + " y el area és: " + (sqrt(s*(s - costat1_double)*(s - costat2_double)*(s - costat3_double))))
                            }
                            else {
                                println("Has primero la opción 1 para establecer las medidas.")
                            }
                    5 -> {
                        // le diremos que salga dandole al boolean el valor de false
                        println("Saliendo..")
                        boolean = false
                    }
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