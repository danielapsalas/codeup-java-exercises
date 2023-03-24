
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        1.Copy this code into your main method:
//
//
//        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//
//
//        The value of pi is approximately 3.14.
//        Don't change the value of the variable; instead, reference one of the links
//        above and use System.out.format to accomplish this.
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi);

//        Prompt a user to enter a integer and store that value in an int variable
////        using the nextInt method.
        Scanner myNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter a number: ");

        int userNumber = myNum.nextInt();  // Read user input
        System.out.println("User number is: " + userNumber);  // Output user input



//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them
//        back in the console, each on a newline.
//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

        Scanner my1stWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter three words: ");

        String oneWord = my1stWord.nextLine();  // Read user input
        System.out.println("User 1st word: " + oneWord);  // Output user input

        Scanner my2ndWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter three words: ");

        String twoWord = my2ndWord.nextLine();  // Read user input
        System.out.println("User 2nd word: " + twoWord);  // Output user input

        Scanner my3rdWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter three words: ");

        String thirdWord = my3rdWord.nextLine();  // Read user input
        System.out.println("User 3rd word: " + thirdWord);  // Output user input
    }
}
