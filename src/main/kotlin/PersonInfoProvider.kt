interface PersonInfoProvider {
    fun printInfo(person: Person)
}


// : what you want to implement
// abstract class is used when you don't want to use everything from the implementor
class BasicInfoProvider : PersonInfoProvider {
    // need override here
    override fun printInfo(person: Person) {
        println("printInfo")
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}