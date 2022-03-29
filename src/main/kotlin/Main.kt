import Empleados.Comercial
import Empleados.Repartidor

fun main(args: Array<String>) {

    var repartidor = Repartidor("Maycol", 18, 1200, "zona 3")
    var comercial = Comercial("Caros", 35, 1800, 250.0)


    print("Repartidor: " + repartidor.plus())
    print("Comercial: " + comercial.plus())
}