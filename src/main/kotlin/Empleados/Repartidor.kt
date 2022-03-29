package Empleados

class Repartidor(nombre : String, edad : Int, salario : Int, var zona : String = "") : Empleado(nombre, edad, salario) {



    override fun plus(): Int {
        if (edad >= 25 && zona == "zona 3" ){
            var i: Int = salario + plus
            return i
        }else {
            return salario
        }

    }
}