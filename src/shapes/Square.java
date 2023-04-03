package shapes;

public class Square extends Rectangle{//Create a class named Square, also inside of shapes, that extends Rectangle
    public Square(double oneSide) {// Square should define a constructor that accepts one argument, side,
        super(oneSide, oneSide);//and calls the parent's constructor to set both the length and width to the value of side
    }
}


