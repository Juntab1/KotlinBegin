import java.util.*

// Enum class, set predefined constants
enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

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
            EntityType.HELP -> type.getFromattedName()
        }
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

// sealed classes help us define class hierarchies, define set number of classes that
// extend the base site
// can have different types and properties
// have different types of classes within it
// also object declaration
sealed class Entity() {
    object Help : Entity(){
        val name = "Help"
    }

    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}



fun main() {
    val entity:Entity = EntityFactory.create(EntityType.EASY)
    val msg = when (entity) {
        // singleton so no reason to have is
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "medium class"
        is Entity.Medium -> "hard class"
    }

    println(msg)


}