import java.util.*

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
    var userInput= checkString("Escribe Y/N")
    println(pMessage)
    if (userInput=="Y"){
        isCamper=true
    }else{
        isCamper=false
    }
    return isCamper

}


