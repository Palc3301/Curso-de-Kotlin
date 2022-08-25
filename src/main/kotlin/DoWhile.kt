fun main(){
    var temperature: Int
    var plus: Int = 0
    var quantity: Int = 0

    do {
        println("Digite uma temperatura ou 999 para sair")
        temperature = readLine()!!.toInt()

        if (temperature != 999) {
            plus += temperature // somatorio = somatoria + temperatura
            quantity++ //quantidade = quantidade + 1
        }
    } while (temperature != 999)
    println("A media da temperatura = ${plus/quantity}")
}