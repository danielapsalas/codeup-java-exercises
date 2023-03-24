
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

//        Explore the Scanner Class.

//        1.Prompt a user to enter a integer and store that value in an int variable
//        using the nextInt method.
        Scanner myNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter a number: ");

        int userNumber = myNum.nextInt();  // Read user input
        System.out.println("User number is: " + userNumber);  // Output user input



//        2.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them
//        back in the console, each on a newline.
//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?

        Scanner my1stWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter first word: ");

        String oneWord = my1stWord.nextLine();  // Read user input
        System.out.println("User 1st word: " + oneWord);  // Output user input

        Scanner my2ndWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter second word: ");

        String twoWord = my2ndWord.nextLine();  // Read user input
        System.out.println("User 2nd word: " + twoWord);  // Output user input

        Scanner my3rdWord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter third word: ");

        String thirdWord = my3rdWord.nextLine();  // Read user input
        System.out.println("User 3rd word: " + thirdWord);  // Output user input

//        3.Prompt a user to enter a sentence, then store that sentence in a String variable
//        using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?

        Scanner userSentence = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter a sentence: ");

        String sentence = my1stWord.nextLine();  // Read user input
        System.out.println("User sentence: " + sentence);  // Output user input

//        Calculate the perimeter and area of Codeup's classrooms.
//        1.Prompt the user to enter values of length and width of a classroom at Codeup
//                (or your room if virtual).
//
//        Use the nextLine method each time you need to get user input. In this case, we
//        need it twice, once to get the user input for the length and again to get the
//        user input for the width. Parse the resulting strings to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.

    }
}
