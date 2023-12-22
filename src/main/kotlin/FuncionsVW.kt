import kotlin.math.round

/**
 * This method displays a welcome message in the console
 * @since 22/12/2023
 * @autor Mohamed Koujil
 * @version 1.0.0
 */
fun benvinguda() {
    println(BLUE_BOLD +
            "   ---------------------------.\n" +
            " `/\"\"\"\"/\"\"\"\"/|\"\"|'|\"\"||\"\"|   ' \\.\n" +
            " /    /    / |__| |__||__|      |\n" +
            "/----------=====================|\n" +
            "| \\  /V\\  /    _.               |\n" +
            "|()\\ \\W/ /()   _            _   |\n" +
            "|   \\   /     / \\          / \\  |-( )\n" +
            "=C========C==_| ) |--------| ) _/==] _-{_}_)\n" +
            " \\_\\_/__..  \\_\\_/_ \\_\\_/ \\_\\_/__.__.\n" +
            RESET)
    val benvinguda = "Benvingut a la calculadora de preu de vehicles Volkswagen Grand California".split(" ")
    val colors = arrayOf(YELLOW_UNDERLINED, GREEN_UNDERLINED, BLUE_UNDERLINED, PURPLE_UNDERLINED, CYAN_UNDERLINED, WHITE_UNDERLINED)
    var cont = -1
    for (i in benvinguda.indices) {

        if (cont == colors.indices.last) cont = 0
        else cont++

        print(colors[cont] + "${benvinguda[i]} " + RESET)
    }
    println()
}

/**
 * This method can be used to calculate the base price according to the type of vehicle
 * @param coche Type of vehicle
 * @return preu price of the vehicle
 */
fun preuBase(coche: Int): Float {
    var preu = 73490.0F
    if (coche == 2) preu += 20000
    return preu
}

/**
 * This method can be used to calculate the loss of value according to the kilometers, years and if it has a bike rack
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
 * @param preu Base price of the vehicle
 * @param perdua Loss of value of the vehicle
 * @return preuFinal Final price of the vehicle
 */
fun preuFinal(preu: Float, perdua: Float): Float {
    return preu - perdua
}