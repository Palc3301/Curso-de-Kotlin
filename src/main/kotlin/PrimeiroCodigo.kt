/*fun main(args: Array<String>) {
    println("Hello World!")
}*/
fun main() {
    println(max(10, 5))
}
// Corpo de bloco
fun max(a: Int, b:Int): Int {
    return if (a > b) a else b
}
// Corpo de expressao
fun max1(a: Int, b: Int): Int = if (a > b) a else b
