package one.digitalinnovation.colletions

fun main(){
    val joao = Funcionario("Joao",2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("________________________")
    println(funcionarios.find { it.nome == "Maria" })

    println("________________________")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }

    println("________________________")
    funcionarios
        .groupBy { it.tipoContracacao }
        .forEach{ println(it) }
}

