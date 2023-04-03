package shapes;

import java.util.Arrays;

public class ShapesTest {//Test your code by creating a new class, ShapesTest (also inside of shapes)

    public static void main(String[] args) {// with a main method.


        //create a variable of the type Rectangle named box1 and assign it a new instance
        // of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("box1 rectangle area: " + box1.getArea());//verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println("box1 perimeter: " + box1.getPerimeter() + "\n");


        //create a variable of the type Rectangle named box2 and assign it a new instance of
        // the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);
        System.out.println("box2 rectangle area: " + box2.getArea());//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println("box2 perimeter: " + box2.getPerimeter() + "\n");

    }
}