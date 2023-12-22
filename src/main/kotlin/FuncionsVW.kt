import kotlin.math.round

/**
 * This method displays a message in different colors, these can be changed in the array "colors"
 * @author mohamedkoujil
 * @since 22/12/2023
 * @version 1.0.0
 * @param missatge Message to be displayed
 */
fun titolColors(missatge: String) {
    val benvinguda = missatge.split("")
    val colors = arrayOf(YELLOW_UNDERLINED, GREEN_UNDERLINED, BLUE_UNDERLINED, PURPLE_UNDERLINED, CYAN_UNDERLINED, WHITE_UNDERLINED)
    var colorsIndex = 0
    for (i in benvinguda.indices) {

        print(colors[colorsIndex] + benvinguda[i] + RESET)

        // If there are more letters than colors, colorsIndex is reset to 0 to avoid errors
        if (colorsIndex == colors.indices.last) colorsIndex = 0
        else colorsIndex++
    }
    println()
}

/**
 * This method can be used to calculate the base price according to the type of vehicle
 * @author mohamedkoujil
 * @since 22/12/2023
 * @version 1.0.0
 * @param coche Type of vehicle
 * @return preu price of the vehicle
 */
 //<a id="codigo-importante"></a>
fun preuBase(coche: Int): Float {
    var preu = 73490.0F
    if (coche == 2) preu += 20000
    return preu
}

/**
 * This method can be used to calculate the loss of value according to the kilometers, years and if it has a bike rack
 * @author mohamedkoujil
 * @since 22/12/2023
 * @version 1.0.0
 * @param kilometres Kilometers of the vehicle
 * @param anys Years of the vehicle
 * @param portaBicis If the vehicle has a bike rack
 * @return perdua Loss of value of the vehicle
 */
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

/**
 * This method can be used to calculate the final price according to the base price and the loss of value
 * @author mohamedkoujil
 * @since 22/12/2023
 * @version 1.0.0
 * @param preu Base price of the vehicle
 * @param perdua Loss of value of the vehicle
 * @return preuFinal Final price of the vehicle
 */
fun preuFinal(preu: Float, perdua: Float): Float {
    return preu - perdua
}
