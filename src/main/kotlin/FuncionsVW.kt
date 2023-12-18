fun preuBase(coche: Int): Float {
    var preu    = 73490.0F
    if (coche == 2) preu += 20000
    return preu
}
fun calculPerdua (kilometres: Double): Double {
    val perdua = when {
        kilometres < 5000 -> 0.0
        kilometres < 10000 -> 200.0
        kilometres >= 10000 -> 300.0
        else -> 0.0
    }
    return perdua + kilometres*0.00001
}

fun preuFinal(preu: Float, perdua: Double): Float {
    return preu - perdua.toFloat()
}