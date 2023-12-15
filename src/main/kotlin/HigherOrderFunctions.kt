// higher order functions
// return another function
// take functions as parameter values

// take in string and return boolean
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if(predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("J")
}



fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript")
    printFilteredStrings((list), predicate)

    printFilteredStrings(list, null)
}