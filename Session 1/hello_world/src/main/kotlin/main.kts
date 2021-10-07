fun main () {
    val students = arrayOf("Benoit", "Finn", "Cass", "Sebastiaan", "Freya")
    for (student in students){
        hello(student)
    }
}

fun hello (name: String) {
    println("Hello $name")
}