fun main(){
    println("Hello world")
    challengeOne()
}
fun challengeOne(){
    println("Intro challenge 1")
    println("Welcome player! \n If you are a Spyro fan, this game is perfect for you! \n for the first question: name one of the 5 main characters of Spyro: year of the dragon (except Spyro ofc)")

    val answers = setOf<String>("Sparx", "Hunter", "Sheila", "Sergeant Byrd", "Bentley")
    val userAnswer = readLine()
    if (answers.contains(userAnswer)){
        win()
    }else{
        gameOver()
    }
}

fun win(){
    println("WOHOOO you can go to the next level now!")
}
fun gameOver(){
    println("BOOOO GAME OVER!!")
}