package one.digitalinnovation.digionebank

enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");
}

/*Colocando o "val" antes da "descricao" mostra que
ele é uma propriedade (se é uma propriedade, ela tem o get, por ser val)

                       val
                        |
                        V
enum class ClienteTipo(___ descricao: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");
}*/