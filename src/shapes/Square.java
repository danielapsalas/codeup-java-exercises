package shapes;

public class Square extends Rectangle{//Create a class named Square, also inside of shapes, that extends Rectangle
    private double oneSide;
    public Square(double oneSide) {// Square should define a constructor that accepts one argument, side,
        super(oneSide, oneSide);//and calls the parent's constructor to set both the length and width to the value of side
        this.oneSide = oneSide;
    }

    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    @Override
    public double getPerimeter(){
        return ((oneSide * 4));
    }

    @Override
    public double getArea(){
        return (Math.pow(oneSide, 2));
    }
}


