fun sayHello(itemToGreet:List<String>){
    itemToGreet.forEach {
        println(it)
    }
}



fun main() {
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }

    // by default a collection in Kotlin is immutable
    // create mutable
    val mutable = mutableListOf("3")
    mutable.add("2")
    println(mutable)
    sayHello(interestingThings)

//    using list
//    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
//    interestingThings[0]
//    interestingThings.get(1)
//    interestingThings.forEach {
//        println(it)
//    }

}



