import javax.print.DocFlavor.STRING

fun obterMnemonica(cor: Cor) =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguem"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Alem e"
        Cor.LARANJA -> "Legal"
    }
fun obterTemperatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}
fun main() {
    val mnemonica =obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val  temperatura = obterTemperatura(Cor.AZUL)
    println(temperatura)

}