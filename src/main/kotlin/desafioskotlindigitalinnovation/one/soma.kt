package desafioskotlindigitalinnovation.one

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    println("Soma de a + b: \n")

    println("Digite o valor de a: ")
    val a = input.nextInt()

    println("Digite o valor de b: ")
    val b = input.nextInt()

    val soma = a.plus(b)

    println("SOMA = $soma")  //insira as variáveis corretamente
}