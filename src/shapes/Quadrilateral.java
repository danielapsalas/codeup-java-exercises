package shapes;

public abstract class Quadrilateral extends Shape implements Measurable { //Inside of shapes, create an abstract Quadrilateral class that extends //Shape and implements Measurable.

    protected double length;//protected properties for length and width.
    protected double width;

    public Quadrilateral (double length, double width) { //a constructor that accepts two numbers for the length and width and sets those properties.
        this.length = length;
        this.width = width;
    }

    public double getLength() {//methods for getting the length and width.
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);//abstract methods for setting the length and width.
    public abstract void setWidth(double width);
}

