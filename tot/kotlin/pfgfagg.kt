import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // busquem el numero de voltes i crear variables per després. 
    var voltes = scan.nextInt()
    var energia:Int
    var energia_mas_alta = 0
    for (i in 1..voltes) { // donarem tantes voltes com digui l'usuari
        for (x in 1..5) {
           energia = scan.nextInt()
           if (energia > energia_mas_alta) energia_mas_alta = energia // Guardarem el valor de enegia més gren dels 5 casos
        }
        when  { // Depenen del valor d'energia escollirem un resultat
            energia_mas_alta < 1000 -> println("H")
            energia_mas_alta < 10000 -> println("B")
            energia_mas_alta >= 10000 -> println("M")
        }
        energia_mas_alta = 0
    }
}