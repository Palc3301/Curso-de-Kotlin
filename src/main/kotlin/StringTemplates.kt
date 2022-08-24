fun main() {
    val nome = "Pedro"
    println("Hello $nome!")
    println("Hello \$nome!")

    println("Soma é :${soma(10,10)}")
}
fun soma(a: Int, b:Int): Int {
    return a + b
}