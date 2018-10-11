package week4.task2;

public class Square extends Rectangle{
    private double side;

    public Square() {
        this.side = this.getLength();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        color = this.getColor();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square\nSide: " + side + "\n"
                + super.toString() + "\n";
    }
}