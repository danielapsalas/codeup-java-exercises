package shapes;


public class Rectangle extends Quadrilateral implements Measurable{

    //IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
    public Rectangle(double length, double width) {
        super(length, width);
    }//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.


    //IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("rectangle");
        return ((this.width * 2) + (this.length * 2));
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }

}

//public class Rectangle {//Inside of your shapes directory, create a class named Rectangle
//    protected double length; // It should have protected properties for both length and width
//    protected double width; //and width
//
//    public Rectangle(double oneLength, double oneWidth) { //Rectangle should define a constructor that accepts two numbers for length and width
//        this.length = oneLength;//and sets those properties.
//        this.width = oneWidth;
//    }
//
//    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//    public double getArea() {
//        return (this.width * this.length);
//    }
//
//    public double getPerimeter() {
//        return ((this.width * 2) + (this.length * 2));
//    }
//}

