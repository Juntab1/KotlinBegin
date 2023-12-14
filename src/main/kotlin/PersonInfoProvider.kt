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
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    // protected helps hide the implementation detail to the user
    protected open val sessionIdPrefix = "Session"
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print stuff")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = FancyInfoProvider()

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