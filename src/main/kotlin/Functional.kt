fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
    // s is a personal one created to take over "it"
    // we have null maybe so need to add in safe calls
    val map = list
        .filterNotNull()
        // mapping string to its length
        .associate {it to it.length}

    val language = list.first()
    println(language)
}