import java.util.*
import kotlin.math.round

fun readFloat(pMessage : String, pMin : Int, pMax : Int) : Float{
    var valor = 0.0f
    val scan = Scanner(System.`in`)
    var correctType = false

    do{
        println(pMessage)
        correctType = scan.hasNextFloat()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextFloat()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}
fun calculPerdua (kilometros: Float): Double {
    var perdua:Double = 0.0
    for (i in 1..kilometros.toInt()) {
        perdua += 0.00001
    }
    return perdua
}

fun preuFinal(preu: Int, perdua: Double): Double {
    var preuCamper = 0
    if (checkCamper()) preuCamper = preu+20000
    return round(preu - (preu * (perdua / 100)))
}
fun main() {
    var kilometros=readFloat("¿Cuantos kilometros tiene tu furgoneta?", 0, 10000000)
    var preu = 73490
    calculPerdua (kilometros)
    println("preu de venta = ${preuFinal(preu, calculPerdua(kilometros))}€")
}