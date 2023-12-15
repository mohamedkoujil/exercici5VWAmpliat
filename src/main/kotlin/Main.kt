fun main() {
    println("Hello World!")
    calculPerdua ()
    preuFinal (preu, calculPerdua())
}

fun calculPerdua (kilometros: Int): Double {
    var perdua:Double = 0.0
    for (i in 1..kilometros) {
        perdua += 0.00001
    }
    return perdua
}

fun preuFinal(preu, perdua) {
    return preu - (preu * (perdua / 100))
}