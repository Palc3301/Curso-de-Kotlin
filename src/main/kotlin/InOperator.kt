fun main(){
    println(isLetter('a'))
    println(isLetter('7'))
    println(isNotDigital('x'))
    println(isNotDigital('6'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigital(c: Char) = c!in '0'..'9'
