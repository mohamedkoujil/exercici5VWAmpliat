
fun main() {
    val coche = readInt("Seleccioni el seu vehicle\n" +
            "1. Volkswagen Grand California\n" +
            "2. Volkswagen Grand California Camper Full Equip", 1, 2)

    val km = readInt("Kilometratje dels pneumatics", 0, 10000000)

    println("Preu Basse: ${preuBase(coche)}€\nPreu Final: ${preuFinal(preuBase(coche), calculPerdua(km))}€")
}
//