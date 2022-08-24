class Retangulo(val altura: Int, val largura: Int) {

    val isQuadrado: Boolean
        get(){
            return altura == largura
        }
    val isQuadrado2: Boolean
        get() = altura == largura
}

fun main() {
    val retangulo: Retangulo = Retangulo(10,10)
    println(retangulo.isQuadrado)
    println(retangulo.isQuadrado2)
}