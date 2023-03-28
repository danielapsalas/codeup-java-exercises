import java.util.Scanner;
public class MethodsExercises {

//    1.Basic Arithmetic
//
//    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//            Subtraction
//    Multiplication
//            Division
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your methods and verify the output.
//
//    Add a modulus method that finds the modulus of two numbers.
//
//    Food for thought: What happens if we try to divide by zero? What should happen?

    public static double adding(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracting(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplying(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividing(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println("addition: " + adding(10, 1));
        System.out.println("subtraction: " + subtracting(10, 1));
        System.out.println("multiplying: " + multiplying(10, 1));
        System.out.println("dividing: " + dividing(10, 1));
        System.out.println("modulus: " + modulus(10, 1));
        getInteger(1, 10);
    }


//    2.Create a method that validates that user input is in a certain range and returns that input as an integer if it
//    is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//    The method signature should look like this:
//
//    public static int getInteger(int min, int max);
//    and is used like this:
//
//
//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!
    public static int getInteger(int min, int max) {
        Scanner userInt = new Scanner(System.in);
        System.out.printf("Enter a number. Minimum has to be %s and the Maximum is %s", min, max);
        int intInput = userInt.nextInt();
        if (intInput < min || intInput > max) {
            System.out.printf("Integer is Invalid...enter another digit. Minimum has to be %s and the Maximum is %s\n", min, max);
            return getInteger(min, max);
        }
        System.out.println("Number you chose is okay!");
        return intInput;
    }



//    3.Calculate the factorial of a number.
//
//    a.Prompt the user to enter an integer from 1 to 10.
//    b.Display the factorial of the number entered by the user.
//    c.Ask if the user wants to continue.
//    d.Use a for loop to calculate the factorial.
//    e.Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    f.Use the long type to store the factorial.
//    g.Continue only if the user agrees to.
//    h.A factorial is a number multiplied by each of the numbers before it.
//    i.Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24


}

