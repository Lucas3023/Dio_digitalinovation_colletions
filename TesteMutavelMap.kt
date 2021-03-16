package one.digitalinnovation.colletions

fun main(){
    val joao = Funcionario("Joao",2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0, "PJ")
    val maria = Funcionario("Maria",4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.created(joao.nome, joao)
    repositorio.created(pedro.nome, pedro)
    repositorio.created(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("________________________________")
    repositorio.findall().forEach { println(it) }

    println("________________________________")
    repositorio.remove(maria.nome)
    repositorio.findall().forEach { println(it) }
}