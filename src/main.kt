import kotlin.math.abs

fun main(){

    //Pseudocode
        //Variable for user-input temperature "temp"
            //Create an input loop
            //Print specific messages for if "temp" is below, within, or above a certain threshold
            //There IS an error when entering data that is not an integer
    var temp = 0
    var value = 1

    while (temp != value){
        print("Enter your temperature: ")

        temp = readLine()!!.toInt()
        if (temp < 97.5)
            println("You're cold")
        else if (temp <= 99.5)
            println("You're at a healthy temperature")
        else if (temp > 99.5)
            println("You're burning up")
        else
            println("Retry.")
    }
}