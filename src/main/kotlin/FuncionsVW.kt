fun calculPerdua1 (kilometros: Float): Double {
    var perdua:Double = 0.0
    for (i in 1..kilometros.toInt()) {
        perdua += 0.00001
    }
    return perdua
}