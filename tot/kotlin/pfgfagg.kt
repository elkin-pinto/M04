import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // agafarem la entrada de dades i calcularem el nombre de febrero després
    var casos = scan.nextInt()
    var pisos = scan.nextInt()
    var febrero = 0
    for (i in 1..casos) {
        for (i in 1..pisos) {
            febrero = febrero + (i*i)
        }
        println(febrero)
        febrero = 0
        pisos = scan.nextInt()
    }
}