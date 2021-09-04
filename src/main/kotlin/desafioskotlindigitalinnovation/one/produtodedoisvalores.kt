package desafioskotlindigitalinnovation.one

fun main(args: Array<String>) {

    println("Produto de dois valores\n")

    println("Digite o 1º valor: ")
    val a = readLine()!!.toInt()

    println("Digite o 2º valor: ")
    val b = readLine()!!.toInt()

    println("PROD = ${ a.times(b) }")   //insira as variaveis corretamente

}