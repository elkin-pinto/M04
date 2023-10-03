import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // agafarem la entrada de dades i crearem variables buides per després.
    var nota = scan.nextInt()
    var md = 0
    var i = 0
    var s = 0
    var b = 0
    var n = 0
    var e = 0
    var notes = 0
    var mitjana = 0.0
    // Preguntarem les notes i les guardarem on sigui necessari.
    while (nota != -1) {
        when (nota) {
            in 0..3 -> md++
            4 -> i++
            5 -> s++
            6 -> b++
            in 7..8 -> n++
            in 9..10 -> e++
        }
        if (nota in 0..10){
            notes++ 
            mitjana = nota + mitjana
        }
        nota = scan.nextInt()
    }
    mitjana = mitjana / notes
    println("NOTES: $notes MITJANA: $mitjana E: $e N: $n B: $b S: $s I: $i MD: $md")
}