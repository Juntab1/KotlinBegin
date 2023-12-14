//object declaration, thread-safe: runs correctly during simultaneous execution by multiple threads
object EntityFactory {
    fun create() = Entity("id", "Kotlin")
}


class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}


fun main() {
    val entity = EntityFactory.create()
    println(entity)
}