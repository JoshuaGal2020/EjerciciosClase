package com.example.ejercicios

class Dado(var numero:Int) {

    fun Tiro(){
        var const1=1
        var NumeroFinal=0

        if(numero >=1 && numero<=6){
            var Nrandom = (1..40).random()
            NumeroFinal = Nrandom
            println("El numero es: $NumeroFinal")

        }else{
            NumeroFinal = const1
            println("A obtenido un numero mayor a 6, $NumeroFinal")
        }
    }
}