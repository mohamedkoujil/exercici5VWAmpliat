fun main() {
    val coche = readInt("Seleccioni el seu vehicle\n" +
            "1. Volkswagen Grand California\n" +
            "2. Volkswagen Grand California Camper Full Equip", 1, 2)

    val km = readDouble("Kilometratje: ", 0, 100000000)

    println("Preu Basse: ${preuBase(coche)}€\nPreu Final: ${preuFinal(preuBase(coche), calculPerdua(km))}€")
}
