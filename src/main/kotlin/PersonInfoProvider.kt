interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}


// : what you want to implement
// abstract class is used when you don't want to use everything from the implementor
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print stuff")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())

    checkTypes(provider)
}

// typecasting
fun checkTypes(infoProvider: PersonInfoProvider) {
    // if info provider is an instance of the session info provider
    if(infoProvider !is SessionInfoProvider) {
        println("is not a session info provider")
    }
    else{
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}