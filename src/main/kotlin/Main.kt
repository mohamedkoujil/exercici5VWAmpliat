fun main() {
    println(
        BLUE_BOLD +
                "   ---------------------------.\n" +
                " `/\"\"\"\"/\"\"\"\"/|\"\"|'|\"\"||\"\"|   ' \\.\n" +
                " /    /    / |__| |__||__|      |\n" +
                "/----------=====================|\n" +
                "| \\  /V\\  /    _.               |\n" +
                "|()\\ \\W/ /()   _            _   |\n" +
                "|   \\   /     / \\          / \\  |-( )\n" +
                "=C========C==_| ) |--------| ) _/==] _-{_}_)\n" +
                " \\_\\_/__..  \\_\\_/_ \\_\\_/ \\_\\_/__.__.\n" +
                RESET
    )

    titolColors("Benvingut a la calculadora de preu de vehicles Volkswagen Grand California")

    val coche = readInt("Seleccioni el seu vehicle\n" +
                        "1. Volkswagen Grand California\n" +
                        "2. Volkswagen Grand California Camper Full Equip"
                        ,"Introdueixi un número"
                        ,"Introdueixi un valor vàlid"
                        ,1, 2)


    val km = readDouble("Quants kilòmetres té el seu vehicle?", "Introdueixi un valor vàlid")

    var anys = readInt("Quants anys té el seu vehicle?"
        ,"Introdueixi un valor vàlid"
        ,"Introdueixi un valor vàlid"
        ,0, 30)

    var portaBicis = readBoolean("El seu vehicle incorpora portabicis? (True/False)"
        ,"Introdueixi un valor vàlid")

    println("Preu Base: ${preuBase(coche)}€\nPreu Final: ${preuFinal(preuBase(coche), calculPerdua(km, anys, portaBicis))}€")
}
