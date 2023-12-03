// Persona.kt
class Persona(val name: String, val age: Int, val occupation: String) {
    fun mostrarDescripcion() {
        println("$name, $age year, $occupation")
    }
}

// Main.kt
fun main() {
    val persona1 = Persona("Juan", 30, "Engineer")
    val persona2 = Persona("Maria", 25, "Doctor")
    val persona3 = Persona("Jose", 40, "architect")
    val persona4 = Persona("karla", 50, "Lawyer")

    persona1.mostrarDescripcion()
    persona2.mostrarDescripcion()
    persona3.mostrarDescripcion()
    persona4.mostrarDescripcion()
}

