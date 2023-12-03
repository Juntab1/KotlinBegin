fun sayHello(name:String){
    println("Hello $name")
}


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(2))

    // Usually use it because that is the standard but can change it with "whatever ->"
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

}



