import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // busquem el numero de voltes i crear variables per després. 
    var voltes = scan.nextInt()
    var dies:Int
    var infectats:Int
    var alarma:String? = null
    for (i in 1..voltes) { // donarem tantes voltes com digui l'usuari
        dies = scan.nextInt() // agafarem un numero per cada volta del bucle
        alarma = "OK"
        for (i in 1..dies) { // farem tants dies com digui l'usuari
            infectats = scan.nextInt()
            if (infectats > 299) alarma = "ALARMA" // Si la condicio es certa sera una alarma
        }
        println(alarma)
    }
}