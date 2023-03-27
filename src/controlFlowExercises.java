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
//        int z = 2;
//        do {
//            System.out.println(z);
//            z *= 2;
//        } while (z < 1000000);


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
    }
}
