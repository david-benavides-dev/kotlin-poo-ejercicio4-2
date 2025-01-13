import classes.Persona

fun main() {

    val persona1 = Persona(10.0, 1.70)
    val persona2 = Persona(50.0, 1.60, "Manuel")
    val persona3 = Persona(65.0,1.20, "Pepe")


    println("\n*********************************************")
    println(persona1)
    println("*********************************************\n")
    println(persona2)
    println("*********************************************\n")
    println(persona3)
    println("*********************************************\n")


    // TODO Crear función.
    print("Introduce nombre para persona1 >> ")
    val nombre = readln()
    persona1.nombre = nombre
    println("Persona1 actualizado \n*********************************************")
    println("Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")


    println("\n*********************************************\n")
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${persona3.calcularImc()}")
    persona3.altura = 1.80
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${persona3.calcularImc()}")

    if (persona3.equals(persona1)) {
        println("Es igual")
    } else {
        println("No es igual")
    }

}