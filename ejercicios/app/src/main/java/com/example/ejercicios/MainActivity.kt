package com.example.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //operario("Joshua",20,12,1)
        //tabla(2,10)
        //Empleado("Joshua",500,"Mantenimiento","Inspector",10)
        Dado(2).Tiro()
    }

    fun operario(nombre:String,pagohora:Int,HorasTrabajadas:Int,horasextras:Int){
        println("El nombre del operario es $nombre")
        var sueldo = HorasTrabajadas*pagohora
        var pagoextra = horasextras*pagohora*2

        var pagototal = sueldo+pagoextra
        println("El operario: $nombre recibira un sueldo base de $sueldo por el trabajo realizado ademas se le agregaran el sueldo por horas extras realizadas que es $pagoextra Su sueldo total devengado en este mes sera de $pagototal" )

    }
    fun Tabla(tabla:Int,final:Int?= null){
        var termino = 10
        if(final!=null){
            termino= final
        }
        for (num in 1..termino){
            var resultado = num*tabla
            println("$tabla * $num = $resultado ")
        }
    }

}
