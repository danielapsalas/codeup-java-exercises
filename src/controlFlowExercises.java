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
        int i = 5;
        while (i <= 15) {
            System.out.print(" " + i);
            i++;
        }

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
        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (i <= 100);
    }
}

