package one.digitalinnovation.colletions

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracacao: String
){
    override fun toString(): String =
        """
          Nome: $nome
          Salario: $salario
      """.trimIndent()
}
