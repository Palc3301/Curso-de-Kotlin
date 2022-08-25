interface Expressao
class Numero(val valor: Int) : Expressao
class  Soma(val esquerdo: Expressao, val direito: Expressao): Expressao
class Subtracao(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> {
            println("Expressão com número: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw java.lang.IllegalArgumentException("expressão é desconhecida")
    }

/*fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    if (expressao is Subtracao) {
        return avaliacao(expressao.esquerdo) - avaliacao(expressao.direito)
    }

    throw java.lang.IllegalArgumentException("Expressao é desconhecida")*/
fun main() {
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}