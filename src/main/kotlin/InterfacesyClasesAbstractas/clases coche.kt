
// Coche.kt
class Coche : Vehiculo {
    override fun acelerar() {
        println("Acelerando el coche")
    }
}

// Bicicleta.kt
class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("Pedaleando la bicicleta")
    }
}

// Forma.kt
abstract class Forma {
    abstract val area: Double
    abstract fun dibujar()
}

// Circulo.kt
class Circulo(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Dibujando un círculo")
    }
}

// Cuadrado.kt
class Cuadrado(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Dibujando un cuadrado")
    }
}

// Main.kt
fun main() {
    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(25.0)
    val cuadrado = Cuadrado(16.0)

    coche.acelerar()
    bicicleta.acelerar()
    circulo.dibujar()
    cuadrado.dibujar()
}
