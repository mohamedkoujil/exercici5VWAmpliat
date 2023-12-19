import kotlin.math.round

fun preuBase(coche: Int): Float {
    var preu = 73490.0F
    if (coche == 2) preu += 20000
    return preu
}

fun calculPerdua (kilometres: Double, anys: Int, portaBicis: Boolean): Float {

    var perdua: Double = when {
        kilometres < 5000 -> 0.0
        kilometres < 10000 -> 200.0
        kilometres >= 10000 -> 300.0
        else -> 0.0
    }

    perdua += kilometres * when {
        anys < 6 -> 0.0
        anys in 6..10-> 0.0002
        else -> 0.0004
    }

    if (portaBicis) perdua -= 250.0F

    round(perdua * 100) / 100

    return (round(perdua * 100) / 100).toFloat()
}

fun preuFinal(preu: Float, perdua: Float): Float {
    return preu - perdua
}