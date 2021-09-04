package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val pedro = Cliente(
        nome="Pedro Paulino",
        cpf="354.546.852-94",
        clienteTipo= ClienteTipo.PF,
        senha="425682"
    )
    println(pedro)

    TesteAutenticacao().autentica(pedro)
}