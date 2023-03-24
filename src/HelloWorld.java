public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

//        1.Create an int variable named myFavoriteNumber and assign
//        your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

//        2.Create a String variable named myString and assign a string value
//        to it, then print the variable out to the console.
        String myString = "Cookie";
        System.out.println(myString);

//        3.Change your code to assign a character value to myString. What do you notice?
//            myString = 'A'; You get an incompatible types

//        4.Change your code to assign the value 3.14159 to myString. What happens?
//            myString = 3.14159; You get an incompatible types

//        5.Declare an long variable named myNumber, but do not assign anything to it. Next
//          try to print out myNumber to the console. What happens?
//            long myNumber = ;
//            System.out.println(myNumber); You get java: illegal start of expression

//        6.Change your code to assign the value 3.14 to myNumber. What do you notice?
//            long myNumber = (long) 3.14; You have to put a cast

//        7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            float myNumber = 123L;
            long my2ndNumber = 123L;
            System.out.println("float: " + myNumber);
            System.out.println("long: " + my2ndNumber);

//        8.Change your code to assign the value 123 to myNumber.
            myNumber  = 123;
            System.out.println(myNumber);

//        9.hy does assigning the value 3.14 to a variable declared as a long not compile, but
//          assigning an integer value does? Change your code to declare myNumber as a float. Assign
//          the value 3.14 to it. What happens? What are two ways we could fix this?
    }
}
