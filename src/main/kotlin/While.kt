
fun main() {

    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999) {
        println("Digite uma temperatura ou 999 para sair")
        temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatorio += temperatura // somatorio = somatoria + temperatura
            quantidade++ //quantidade = quantidade + 1

        }
    }
    println("A media da temperatura = ${somatorio/quantidade}")
}