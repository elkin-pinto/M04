import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    var frase = scan.nextLine()
    for (i in 1..vueltas) {
        var a = 0
        var e = 0
        var i = 0
        var o = 0
        var u = 0
        frase = scan.nextLine()
        for (x in frase) {
            when (x) {
                'a' -> a++
                'e' -> e++
                'i' -> i++
                'o' -> o++
                'u' -> u++
                'A' -> a++
                'E' -> e++
                'I' -> i++
                'O' -> o++
                'U' -> u++
            }
        }
        println("A: $a E: $e I: $i O: $o U: $u")
    }
}