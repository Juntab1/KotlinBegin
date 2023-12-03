// can just create the val within the parameter instead of making it a val in the class itself
// types of visibility
// internal: public within the module
// private: only within the file it is in
// protected: you can do this for variables and such to make it private for that class or file
class Person(val firstName: String = "Jun", val lastName: String = "B") {

    // var since it will change later
    var nickName : String? = null
        set(value) {
            // setting the value of nickName
            field = value
            println("the new nickname is valid")
        }
        get() {
            println("the retuned value is $field")
            return field
        }

    fun printInfo() {
        // elvis operator, ?: , if true return what is on the left side, if not the go on the right side
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName, $nickNameToPrint, $lastName")
    }
}