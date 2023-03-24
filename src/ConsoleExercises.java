
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
//        using the nextInt method.
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\nEnter a number: ");

        int userNumber = myObj.nextInt();  // Read user input
        System.out.println("User number is: " + userNumber);  // Output user input

    }
}
