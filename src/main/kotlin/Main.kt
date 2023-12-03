// giving this method a return type
fun getGreeting(): String {
    return "Hello Kotlin"
}

// single expression function
fun getHello() = "Hello"

// Unit is absence of any return type, do not want to return anything
// don't have to have return type
fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
    println(getHello())
}


