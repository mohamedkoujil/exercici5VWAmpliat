import java.util.*

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
fun main() {
    var kilometros=readFloat("¿Cuantos kilometros tiene tu furgoneta?", 0, 10000000)
}