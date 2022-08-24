class Pessoa (
    val nome: String,
    val idade: Int
)

fun main () {
    val pessoa: Pessoa = Pessoa("Pedro",20)
    val pessoa2: Pessoa = Pessoa("Breno",20)

    println("Pessoa 1: ${pessoa.nome} !")
    println("Pessoa 2: ${pessoa2.nome} !")
}