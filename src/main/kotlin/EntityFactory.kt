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

    // data classes are mutable data types that can make hashcode into string and such
    // this helps do quality comparisons
    // immutable data types
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class: $id")
}



fun main() {
    val entity1 = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.MEDIUM)

    // using smart casting to see if it extends
    if (entity2 is Entity.Medium) {
        entity2.printInfo()
    }

    // same entities
//    val entity1 = Entity.Easy("id", "name")
//    val entity2 = Entity.Easy("id", "name")

    // === is a referential which is it checking if it is a reference
    if (entity1 == entity2) {
        println("they are equal")
    }
    else{
        println("they are not equal")
    }

    Entity.Medium("id", "name").printInfo()

}