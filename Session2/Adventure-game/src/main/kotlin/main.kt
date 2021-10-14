import java.util.*
import kotlin.random.Random

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
        challengeTwo()
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
        challengeThree()
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

fun challengeTwoRepeat(){
    println("You return to a place you already know \n The Gnorc has made his way back to block the area and has forgotten how you look so you pass again " +
            "\n he will only let you pass if you choose the right number! \n " +
            "You can choose to answer: \"low\" (between 1-3) or \"high\" (between 4-6)")
    val userAnswer = readLine();

    if (rollDice() == userAnswer){
        challengeThree()
    }else{
        gameOver()
    }
}
fun challengeThree(){
    println("YES you made it past the Gnorc! \n Ohno! the Gnorc was so mad that you beat him at his game that he is coming after you" +
            "\n You can choose an attackmode to get him before he gets you \n " +
            "You can choose between: \"super charge\", \"flying\",  or \"super fire\" ")

    val userAnswer = readLine();
    if (userAnswer == "flying"){
        println("You fled from the Gnorc, you must go back a level")
        challengeTwoRepeat()
    }else if(userAnswer == "super charge"){
        println("You charged the Gnorc to the other side of the realm, you can proceed!")
        challengeFour()
    }else if(userAnswer == "super fire"){
        println("The Gnorc was immune for your fire.")
        gameOver()
    }
}

fun challengeFour(){
    println("You are almost at the end of your adventure \n " +
            "Before you can get to the final boss, you must choose the right portal to go trough \n" +
            "there are a hundred portals, so you must guess the right one (type in digits)")
    val userAnswer = Scanner(System.`in`)
    val numberAnswer:Int = userAnswer.nextInt()
    val random = Random.nextInt(1,100)

    if (numberAnswer == random){
        println("You found the right portal!")
        challengeFive()
    }else if(numberAnswer < random){
        println("You have to guess higher!")
        readLine()
    }else if(numberAnswer > random){
        println("You have to guess lower!")
        readLine()
    }
}

fun challengeFive(){

}
fun win(){
    println("WOHOOO you can go to the next level now!")
}
fun gameOver(){
    println("BOOOO GAME OVER!!")
}