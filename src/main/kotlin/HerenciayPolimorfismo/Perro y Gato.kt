package HerenciayPolimorfismo

// Perro.kt
class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau")
    }
}

// Gato.kt
class Gato : Animal() {
    override fun hacerSonido() {
        println("Miau")
    }
}
// Main.kt
fun main() {
    val animales: List<Animal> = listOf(Perro(), Gato())

    for (animal in animales) {
        animal.hacerSonido()
    }
}