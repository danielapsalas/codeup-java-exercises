import java.util.Scanner;

public class controlFlowExercises {
    public static void main(String[] args) {
//        1.Loop Basics
//
//        a.While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }

//        b.Do While
//
//        1.Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        2.Alter your loop to count backwards by 5's from 100 to -10.
//        3.Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than
//        1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//
//        int y = 0;
//        do {
//            System.out.println(y);
//            y -= 2;
//        } while (y >= -10);
//
//        long z = 2L;
//        do {
//            System.out.println(z);
//            z *= 2;
//        } while (z < 1000000L);


//        2.Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran
//        Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        1.Write a program that prints the numbers from 1 to 100.
//        2.For multiples of three: print “Fizz” instead of the number.
//        3.For the multiples of five: print “Buzz”.
//        4.For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int i = 1; i <= 100; i++){
//            if((i % 15 == 0)){
//                System.out.println(i + ": Fizz");
//                continue;
//            }else if( i % 5 == 0){
//                System.out.println(i + ": Buzz");
//            }else if( i % 3 == 0){
//                System.out.println(i + ": FizzBuzz");
//            }
//        }


//        3.Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//                2      | 4       | 8
//                3      | 9       | 27
//                4      | 16      | 64
//                5      | 25      | 125


//        Scanner userNum = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("\nEnter a number: ");
//


//        4.Convert given number grades into letter grades.
//
//        1.Prompt the user for a numerical grade from 0 to 100.
//        2.Display the corresponding letter grade.
//        3.Prompt the user to continue.
//        4.Assume that the user will enter valid integers for the grades.
//        5.The application should only continue if the user agrees to.
//        6.Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        Scanner usersNum = new Scanner(System.in);  // Create a Scanner object
        boolean usersGrade = true;

        do {
            System.out.println("\nEnter a number from 1 - 100: ");
            int usersInput = usersNum.nextInt();

            if(usersInput >= 88){
                System.out.println("A");  // Output user input
            }else if(usersInput >= 80){
                System.out.println("B");  // Output user input
            }else if(usersInput >= 67){
                System.out.println("C");  // Output user input
            }else if(usersInput >= 60){
                System.out.println("D");  // Output user input
            }else if(usersInput >= 0){
                System.out.println("F");  // Output user input
            }
        }while (usersGrade);
    }
}

//    int num = userNum.nextInt();  // Read user input
//        System.out.println("User's length: " + num);  // Output user input