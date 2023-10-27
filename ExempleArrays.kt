fun main(args: Array<String>) {

    val TAMANY:Int = 5

    //Definim un array d'Strings sense cap valor
    var arr = arrayOf<String>()
    println("Arr size: ${arr.size}")

    //Però ens serveix per rebre el resultat d'una operació
    arr = "Hola que tal?".split(" ").toTypedArray()
    arr += "No"
    println("Arr size: ${arr.size}")
    for (i in arr)
        println(i)

    println("******************")
    //Definim un array ja inicialitzat i podem operar amb els seus elements
    var a1 = arrayOf<Int>(1,2,3,4,5)
    println("Arr size: ${a1.size}")
    for (i in a1) {
        println("valor $i -- valor+1: ${i+1}")
    }

    println("******************")
    //Definim un array de tamany 10, però amb valors NULLS
    var a2 = arrayOfNulls<Int>(TAMANY)
    println("Arr size: ${a2.size}")
    for (i in a2) {
        // Aquesta línia dóna error de compilació (els elements poden ser NULL)
        // println("valor $i -- valor+1: ${i+1}")

        // Per que no doni error de compilació hem de fer servir l'operador not-null assertion
        // Amb això li assegurem al compilador que el valor no serà NULL
        // Molt de compte perquè és responsabilitat nostra assegurar que no és NULL
        // Fer-ho és molt perillós (error d'execució) i hem d'estar molt segurs!
        //println("valor $i -- valor+1: ${i!!+1}")
    }

    //Informem l'array amb valors
    for (i in a2.indices)
        a2[i] = i + 4
    for (i in a2) {
        // Ara ja podem assegurar que no serà null
        println("valor $i -- valor+1: ${i!!+1}")
    }

    println("******************")
    //Definim un array d'enters amb una fòrmula per inicialitzar cada element
    //Les tres formes son equivalents
    var a3 = IntArray(TAMANY) { it*2 }
    //var a3 = IntArray(TAMANY) { it -> it*2 }
    //var a3 = IntArray(TAMANY) { valor -> valor * 2}
    for (i in a3) {
        println("valor $i -- valor+1: ${i+1}")
    }
}

