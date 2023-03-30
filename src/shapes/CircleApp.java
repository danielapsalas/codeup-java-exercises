package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input shape1 = new Input();

        System.out.println("Enter the radius of a circle: ");
        double radius = shape1.getDouble();

        Circle circle = new Circle(radius);

        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("The circumference is %f and the area is %d", circumference, area);
    }
}
