package one.digitalinnovation.colletions

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("_______________________")
    println(salarios.somatoria())

    println("_______________________")
    println(salarios.media())
}
