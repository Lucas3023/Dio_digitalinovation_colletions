package one.digitalinnovation.colletions

fun main (){
    val joao = Funcionario("Joao",2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("_______________List_________________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("________________________________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("_______________Set_________________")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("________________________________")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{ println(it) }

    println("________________________________")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{ println(it) }

}