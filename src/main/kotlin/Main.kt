
// vararg parameter: take variable number of whatever type it is, makes it so we don't have to pass anything in if we do not want
fun sayHello(vararg curr:String){
    curr.forEach {
        println(it)
    }
}



fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    // pass in array and list by using a spread operator, "*
    sayHello(*interestingThings)
    sayHello("1st", "2nd", "3rd")

}



