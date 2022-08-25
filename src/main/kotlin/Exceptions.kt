import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    try {
        val porcentagem = porcentagem(101)
        println(porcentagem)
    } catch (e: java.lang.IllegalArgumentException) {
        println(e.message)
    }

    val idade = lerIdade()
    println(idade)
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw java.lang.IllegalArgumentException("numero deve estar entre 1 e 100")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("C:\\Curso-de-Kotlin\\src\\main\\kotlin\\idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }
}