package classes

/**
 * Representa a una persona con los atributos peso, altura y nombre.
 *
 * Esta clase permite calcular el Índice de Masa Corporal (IMC) de la persona
 * y proporciona métodos para comparar instancias de `Persona`.
 *
 * @property peso El peso de la persona en kilogramos.
 * @property altura La altura de la persona en metros.
 * @property nombre El nombre de la persona. Inicialmente es una cadena vacía.
 */
class Persona(var peso: Double, var altura: Double) {

    val imc: Double
        get() = calcularImc()

    var nombre = ""
    constructor(peso: Double, altura: Double, nombre: String) : this(peso, altura) {
        this.nombre = nombre
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC).
     *
     * @return El IMC calculado como un valor de tipo [Double].
     */
    private fun calcularImc(): Double = peso / (altura * altura)

    /**
     * Devuelve una representación en forma de cadena de la persona.
     *
     * @return Una cadena que incluye el nombre, peso, altura e IMC de la persona.
     */
    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso, Altura: $altura, IMC: $imc"
    }

    /**
     * Compara esta instancia de `Persona` con otra.
     *
     * Dos instancias de `Persona` son consideradas iguales si tienen el mismo peso y altura.
     *
     * @param other El otro objeto a comparar.
     * @return `true` si las instancias son iguales, `false` en caso contrario.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return this.peso == other.peso && this.altura == other.altura
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}