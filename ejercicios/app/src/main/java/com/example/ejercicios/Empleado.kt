package com.example.ejercicios

class Empleado (var nombre:String,var Sueldo:Int,var Area:String, var Cargo:String,var AnhosTrabajo:Int){

    fun infosueldo(){
        if(Sueldo < 0){
            println("No permite una cantidad negativa como sueldo")
        }else if(Area.isEmpty() || Cargo.isEmpty()){
            println("Los campos de Arena y Cargo estan vacios, llene para poder continuar")
        }else{
            var SueldoExtra: Int = 25*(AnhosTrabajo/5)
            var SueldoTotal = SueldoExtra + Sueldo

            println("Nombre: $nombre, tiene $AnhosTrabajo anios de trabajo, su sueldo base es de $Sueldo y el total sera de $SueldoTotal por sus anios de trabajo")
        }
    }
}