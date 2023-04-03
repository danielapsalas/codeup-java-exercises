import java.util.Random;
import java.util.Scanner;

public class Highlow {
//    Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void main(String[] args) {
        highLow();
    }

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static String highLow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 100: ");
        int userNum = scanner.nextInt();
        int compareNum = randomNumber();
        System.out.println("this is the number you picked: " + userNum);
        System.out.println("this is the random number: " + compareNum);

        if(userNum > compareNum){
            return "LOWER";
        } else if (userNum < compareNum) {
            return "HIGHER";
        } else {
            return "GOOD GUESS!";
        }
    }

}
