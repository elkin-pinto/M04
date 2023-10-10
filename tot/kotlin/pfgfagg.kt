import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // Definim el scanner per fer-ho servir
    // Fem un bucle que llegira cada input i determinara si es valid
    var boolean = true
    var vueltas = 0
    var dia:Int = 0
    var mes:Int = 0
    var any:Int = 0
    while (boolean && vueltas != 3) {
        vueltas ++
        when (vueltas) {
            1 -> print("Introdueixi el any: ")
            2 -> print("Introdueixi el mes: ")
            3 -> print("Introdueixi el dia: ")
        }
        if (scan.hasNextInt()) {
            var input = scan.nextInt()
            if (vueltas == 1) {
                if (input in 0..2023) {any = input}
                else {
                    println("Error")
                    vueltas--
                }
            }
            if (vueltas == 2) {
                if (input in 1..12) {mes = input}
                else {
                    println("Error")
                    vueltas--
                }
            }
            if (vueltas == 3) {
                when {
                    mes in intArrayOf(4,6,9,11) && input in 1..30 -> dia = input
                    (mes == 2) && input in 1..28 || any % 4 == 0 && input in 1..29 && any % 100 != 0 || any % 400 == 0 -> dia = input
                    mes in intArrayOf(1,3,5,7,8,10,12) && input in 1..31 -> dia = input
                    else -> {println("Error"); vueltas--}
                }
            }  
        }
        else {
            println("Error")
            vueltas--
            scan.next()
        }
    }
    when {
        mes == 1 && dia > 19 || mes == 2 && dia < 19 -> println("El teu signe del sodiac és: Acuario")
        mes == 2 && dia > 18 || mes == 3 && dia < 21 -> println("El teu signe del sodiac és: Piscis")
        mes == 3 && dia > 20 || mes == 4 && dia < 20 -> println("El teu signe del sodiac és: Aries")
        mes == 4 && dia > 19 || mes == 5 && dia < 21 -> println("El teu signe del sodiac és: Tauro")
        mes == 5 && dia > 20 || mes == 6 && dia < 21 -> println("El teu signe del sodiac és: Géminis")
        mes == 6 && dia > 20 || mes == 7 && dia < 23 -> println("El teu signe del sodiac és: Cáncer")
        mes == 7 && dia > 22 || mes == 8 && dia < 23 -> println("El teu signe del sodiac és: Leo")
        mes == 8 && dia > 22 || mes == 9 && dia < 23 -> println("El teu signe del sodiac és: Virgo")
        mes == 9 && dia > 22 || mes == 10 && dia < 23 -> println("El teu signe del sodiac és: Libra")
        mes == 10 && dia > 22 || mes == 11 && dia < 22 -> println("El teu signe del sodiac és: Escorpio")
        mes == 11 && dia > 21 || mes == 12 && dia < 22 -> println("El teu signe del sodiac és: Sagitario")
        mes == 12 && dia > 21 || mes == 1 && dia < 20 -> println("El teu signe del sodiac és: Capricornio")
    }
    

}