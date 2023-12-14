import java.util.*

// Enum class, set predefined constants
enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFromattedName() = name.lowercase()
}

//object declaration, thread-safe: runs correctly during simultaneous execution by multiple threads
object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFromattedName()
            EntityType.HARD -> "Hard"
        }
        return Entity(id, name)
    }
}


class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}


fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}