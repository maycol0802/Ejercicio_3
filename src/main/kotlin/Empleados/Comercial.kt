package Empleados

class Comercial(nombre : String, edad : Int, salario : Int, var comision : Double = 0.0) : Empleado(nombre, edad, salario) {



    override fun plus(): Int {
        if (edad >= 30 && comision > 200.0 ){
            var i: Int = salario + plus
            return i
        }else {
            return salario
        }
    }
}