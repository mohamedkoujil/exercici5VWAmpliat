fun preuBase(coche: Int): Float {
    var preu = 73490.0F
    if (coche == 2) preu += 20000
    return preu
}
fun calculPerdua (kilometres: Int): Int {
    var perdua = 0
    when {
        kilometres < 5000 -> perdua = 0
        kilometres < 10000 -> perdua = 200
        kilometres >= 10000 -> perdua = 300
    }
    return perdua
}

fun preuFinal(preu: Float, perdua: Int): Float {
    return preu - perdua
}