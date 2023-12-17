import java.util.*


fun readInt(pMessage : String, pMin : Int, pMax : Int) : Int{
    var valor = 0
    val scan = Scanner(System.`in`)
    var correctType = false

    do{
        println(pMessage)
        correctType = scan.hasNextInt()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

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


fun readDouble(pMessage : String, pMin : Int, pMax : Int) : Double{
    var valor = 0.0
    val scan = Scanner(System.`in`)
    var correctType = false

    do{
        println(pMessage)
        correctType = scan.hasNextDouble()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextDouble()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

fun checkString(pMessage:String):String{
    var userInput=""
    var correctValue=true
    val scanner=Scanner(System.`in`)
    do{
        println(pMessage)
        userInput=scanner.next().uppercase()
        if (userInput=="S"||userInput=="N"){
            correctValue=true
        }
        else{
            correctValue=false
            println("Valor incorrecto!")
        }
    }while(!correctValue)
    //scanner.next()
    return userInput
}