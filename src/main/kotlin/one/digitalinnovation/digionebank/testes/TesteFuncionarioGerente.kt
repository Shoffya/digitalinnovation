package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente(nome= "Maria Fernandes",cpf = "457.528.798-55", salario=5000.0, senha = "Senha: 165785")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}