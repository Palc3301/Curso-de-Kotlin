import java.util.TreeMap

fun main(){
    val binaryRepresetattion = TreeMap<Char, String>()

    for (c in 'A'.. 'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresetattion[c] = binary
    }
    for ((letter, binary) in binaryRepresetattion) {
       println("$letter - $binary")
   }
}