package one.digitalinnovation.colletions

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("_______________________")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    println("_______________________")
    salariosMaiorque2500.forEach{ println(it) }

    println("_______________________")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("_______________________")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })


}