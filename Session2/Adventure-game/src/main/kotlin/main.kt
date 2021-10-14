import kotlin.random.Random

fun main(){
    println("Hello world")
    challengeOne()
    if(challengeOne() == win()){
        challengeTwo()
    }
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
fun challengeTwo(){
    println("Congratulations for completing the first challenge!  \n In this challenge the fate of Spyro is up to you! " +
            "\n There is a Gnorc blocking the way and he will only let you pass if you choose the right number! \n " +
            "You can choose to answer: \"low\" (between 1-3) or \"high\" (between 4-6)")
    val userAnswer = readLine();

    if (rollDice() == userAnswer){
        win()
    }else{
        gameOver()
    }
}
fun rollDice():String{
    val random = Random.nextInt(1,6)
    if(random <= 3){
        return "low"
    }else{
        return "high"
    }
}



fun win(){
    println("WOHOOO you can go to the next level now!")
}
fun gameOver(){
    println("BOOOO GAME OVER!!")
}