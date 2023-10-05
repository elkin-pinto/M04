import java.util.*
fun main() {
    var scan = Scanner(System.`in`)
    // busquem el numero de voltes i crear variables per després. 
    var voltes = scan.nextInt()
    // agafarem la vida del monstre, i l'atac de tot dos campeons
    var vida = 0
    var twitch = 0
    var rammus = 0
    var n_voltes = 0
    var guanyador = "RAMMUS"
    for (i in 1..voltes) { // donarem tantes voltes com digui l'usuari
        vida = scan.nextInt()
        rammus = scan.nextInt()
        twitch = scan.nextInt()
        while (vida > 0){ // Treurem el dany de la vida del monstre fins a que sigui 0 o menos i direm qui el va matar el les rondes que van tardar.
            vida = vida - rammus - twitch
            n_voltes++
        }
        if ((vida + twitch) > 0) guanyador = "TWITCH" 
        println("$guanyador $n_voltes") // Fem el print i reiniciem les variables.
        n_voltes = 0
        guanyador = "RAMMUS"
    }
}