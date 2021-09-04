package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista(nome= "João Pedro",cpf = "456.418.753-85", salario=2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
