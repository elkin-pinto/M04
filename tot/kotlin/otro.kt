import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    repeat(vueltas) {
        var input = scan.nextInt()
        var numero_actual = input+1
        while (numero_actual != 1) {
            numero_actual--
            print("$numero_actual ")
        }
        print("\n")
        for (i in 1..input) {
            print("$i ")
        }
        print("\n")
        numero_actual = 1
        do {
            if (numero_actual <= input) print("$numero_actual ")
            numero_actual += 4
        }while(numero_actual <= input)
        print("\n")
        println("---")
   }
   
}