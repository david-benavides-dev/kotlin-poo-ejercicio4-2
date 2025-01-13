package classes

class Persona(var peso: Double, var altura: Double) {
    // Constructor primario.


    // Constructor secundario.
    var nombre = "NONAME"
    constructor(peso: Double, altura: Double, nombre: String) : this(peso, altura) {
        this.nombre = nombre
    }

    // Función que calcula IMC.
    fun calcularImc(): Double {
        return peso / (altura * altura)
    }


    // toString para mostrar la información de la persona en cuestión.
    override fun toString(): String {
        return "nombre: $nombre, peso: $peso, altura: $altura, imc: ${"%2f".format(calcularImc())}"
    }

    // Equals para verificar si dos objetos son iguales o no.
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.peso == other.peso && this.altura == other.altura
    }
}