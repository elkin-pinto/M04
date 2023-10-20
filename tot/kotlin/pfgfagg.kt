import java.util.*

fun main() {
    var vueltas = scan.next.Int()
    scan.nextline()
    for (a in 1..vueltas) {
        var frase = scan.nextline()
        var web = scan.nextline()
        var total_letras = 0
        var igual = 0
        if (frase.lenght() >= web.lenght()) x = frase.lenght()
        else x = web.lenght()
        for (i in 0..(x-1)) {
            if (frase[i] == web[i]) igual++
            total_letras++
        }
        if (igual >=(total_letras/2 )) println("GRACIES WEBCASTELLER")
        else println("WEBCASTELLER ESTA TRAVIESO HOY")
    }
}