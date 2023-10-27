import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    
    repeat(vueltas) {
        var casos = scan.nextInt()
        var arrayNumeros = arrayOfNulls(casos)
        for (i in 0..(arrayNumeros.size - 1)) {
            arrayNumeros[i] = scan.nextInt()
        }
        arrayNumeros.sort()
        for (i in 0..(arrayNumeros - 1)) {
            
        }
    }
} 
