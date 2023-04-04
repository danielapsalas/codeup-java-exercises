package shapes;


public class Square extends Quadrilateral{//Change your existing Square class to extend Quadrilateral.


    public Square(double side) { //intellij makes this for us
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {//intellij makes this for us
        System.out.println("square");
        return (4 * this.width);
    }

    @Override
    public double getArea() {
        return Math.pow(this.width, 2);
    }

}

//public class Square extends Rectangle{//Create a class named Square, also inside of shapes, that extends Rectangle
//    private double oneSide;
//    public Square(double oneSide) {// Square should define a constructor that accepts one argument, side,
//        super(oneSide, oneSide);//and calls the parent's constructor to set both the length and width to the value of side
//        this.oneSide = oneSide;
//    }
//
//    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//    @Override
//    public double getPerimeter(){
//        return ((oneSide * 4));
//    }
//
//    @Override
//    public double getArea(){
//        return (Math.pow(oneSide, 2));
//    }
//}


