// top level variable, non-null by default, can't make it equal to null
var name : String = "Jun1"
// if you want it to be maybe null, use the ?
val name2: String? = "Jun4"
// don't have to say the type but if you do it can't be null
var noType = 1




fun main() {
    // can create and if statement variable
    val ifCheck = when(noType) {
        null -> println("Hi")
        else -> println("Greeting")
    }

    // mutable vairables: can be changed
    var changable: String = "Jun2"
    // unmutable
    val notChange: String = "Jun3"
//    check if it is null
//    if (name2 != null){
//        println(name2)
//    }

    // used for checking a variable and see if it needs to be switched on
//    when(name2){
//        null -> println("it's null")
//        else -> println(name2)
//    }


}