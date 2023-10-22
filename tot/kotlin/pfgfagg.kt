import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var vueltas = scan.nextInt()
    scan.nextLine()
    for (i in 1..vueltas) {
        var lalafel = 0
        var telaranya = 0
        var telaranya_llena:Int
        var frase = scan.nextLine()
        var caben = scan.nextInt()
        var cauntas_llenan:Int
        scan.nextLine()
        frase = frase.uppercase()
        var lista = frase.split(", ")
        for (x in lista) {
            when (x) {
                "TELARANYA" -> telaranya++
                "ARANYA" -> {
                    if (lalafel > 0 && caben > 0) {
                        cauntas_llenan = lalafel / caben
                        telaranya = telaranya - (cauntas_llenan + (lalafel - (caben * cauntas_llenan)))
                    }
                    if (telaranya < 0) telaranya = 0
                    lalafel = 0
                }
                "LALAFEL" -> lalafel++
            }
        }
        if (caben > 0 && telaranya > 0) {
            cauntas_llenan = lalafel / caben
            if (cauntas_llenan >= telaranya) telaranya_llena = telaranya
            else telaranya_llena = cauntas_llenan
        }
        else telaranya_llena = 0
        if (telaranya_llena < 0) telaranya_llena = 0
        println("Hay $telaranya_llena telaranyas llenas.")
    }
}