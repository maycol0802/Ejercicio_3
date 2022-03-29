package Empleados

abstract class Empleado(var nombre : String, var edad : Int, var salario : Int){

    val plus : Int = 300


    abstract fun plus() : Int
}