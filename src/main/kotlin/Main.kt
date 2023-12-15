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
fun checkString(pMessage:String):String{
    var userInput=""
    var correctValue=true
    val scanner=Scanner(System.`in`)
    do{
        println(pMessage)
        userInput=scanner.nextLine()
        if (userInput=="Y"||userInput=="N"){
            correctValue=true
        }
        else{
            correctValue=false
            println("Valor incorrecto!")
        }
    }while(!correctValue)
    scanner.next()
    return userInput
}
fun checkCamper(pMessage:String):Boolean{
    var isCamper=true
    println(pMessage)
    var userInput= checkString("Escribe Y/N")
    if (userInput=="Y"){
        isCamper=true
    }else{
        isCamper=false
    }
    return isCamper

}

fun preuFinal(preu: Int, perdua: Double): Double {
    var preuCamper = 0
    if (checkCamper("Es una camper?")) preuCamper = preu+20000
    return round(preu - (preu * (perdua / 100)))
}
fun main() {
    var kilometros=readFloat("¿Cuantos kilometros tiene tu furgoneta?", 0, 10000000)
    var preu = 73490
    calculPerdua (kilometros)
    println("preu de venta = ${preuFinal(preu, calculPerdua(kilometros))}€")
}