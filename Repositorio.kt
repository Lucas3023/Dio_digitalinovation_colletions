package one.digitalinnovation.colletions

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun created(id: String, value: T){
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findall() = map.values
}