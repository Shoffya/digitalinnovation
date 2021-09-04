package desafioskotlindigitalinnovation.one

import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)

    println("Média de um(a) aluno(a): \n")

    println("Digite a nota 1: ")
    var a = reader.nextDouble()

    println("Digite a nota 2: ")
    var b = reader.nextDouble()

    var weightA = 3.5
    println("O peso da nota 1 é $weightA\n")

    var weightB = 7.5
    println("O peso da nota 2 é $weightB\n")

    var totalWeight = weightA.plus(weightB)

    var m = ( a * weightA + b * weightB) / totalWeight
    println("Desta forma, sua média é: " + "%.5f".format(m))
}