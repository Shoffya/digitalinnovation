package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){

    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - ${elemento.toString()}")
        /*mostra somente seu elemento:
        PF - PF
        PJ - PJ*/
    }

   /*OU:

   ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - $elemento")
    }

   OU:
   ClienteTipo.values().forEach{
        println("${it.name} - $it")
    }

    Que também mostra somente seu elemento:
        PF - PF
        PJ - PJ*/

    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    /*Com o "val" antes da "descricao" no ClienteTipo.kt, desta
    forma mostrara o objeto enum e sua descrição:

    PF - Pessoa Fisica
    PJ - Pessoa Juridica
    --
    O mesmo serve para o it:

    ClienteTipo.values().forEach{
        println("${it.name} - ${it.descricao}")
    }*/

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")

    /*Aqui são dois objetos, como se tivesse em uma classe sendo
    utilizado, que também mostram o objeto enum e sua descrição:

    PF - Pessoa Fisica
    PJ - Pessoa Juridica */
}