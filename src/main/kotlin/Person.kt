// can just create the val within the parameter instead of making it a val in the class itself
class Person(val firstName: String, val lastName: String) {
    // can use '= something' instead of using an init block to create it at first
//    val firstName: String = _firstName
//    val lastName: String = _lastName

    // init 1 and 2 are always run through but the constructor depends on if parameters are passed in for the class or not
    init {
        println("init 1")
    }
    constructor(): this("Jun", "B") {
        println("secondary constructor")
    }

    init {
        println("init 2")
    }
}