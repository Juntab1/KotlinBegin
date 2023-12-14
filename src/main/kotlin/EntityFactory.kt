interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String){
    // companian object is scoped to this class, have access to private constructure class
    // this is like using static classes and such in Java
    // overall helps keep functionality out of the scope of instances
    companion object Factory : IdProvider{
        override fun getId(): String {
            return "123"
        }

        const val id = "id"
        fun create() = Entity(getId())
    }
}


fun main() {
    val entity = Entity.Factory.create()
    Entity.id
}