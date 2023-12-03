
// vararg parameter: take variable number of whatever type it is, makes it so we don't have to pass anything in if we do not want
fun sayHello(vararg curr:String){
    curr.forEach {
        println(it)
    }
}

// Set default for parameters
fun greetPerson(greeting: String = "Hello", name: String = "Jun") = println("$greeting $name")



fun main() {
    // using "parameter =" meaning we can change order of parameters
    greetPerson(name = "hi", greeting = "Jun")
}



