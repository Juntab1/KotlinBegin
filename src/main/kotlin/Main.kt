
// vararg parameter: take variable number of whatever type it is, makes it so we don't have to pass anything in if we do not want
fun sayHello(vararg curr:String){
    curr.forEach {
        println(it)
    }
}

// Set default for parameters
fun greetPerson(greeting: String = "Hello", name: String = "Jun") = println("$greeting $name")



fun main() {
    // just specify class name, don't have to use "new"
    val person = Person("Jun", "B")
    // can do this without a getter or setter
    println(person.lastName)
}



