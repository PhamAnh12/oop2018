package week5_6;

public class Square extends Rectangle {

    public Square(double side) {
        side = 1.0;
        side = 1.0;

    }

    public Square(double side, double x, double y) {
        super(side, side, x, y);
    }

    public Square(double side, double x, double y, String color, boolean filled) {
        super(side, side, color, filled, x, y);
    }

    public void setSquare(double side) {
        setRectangle(side, side);
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public String toString() {
        return "Square: Side = " + getSide();
    }

    public String Coordinates(){
        return super.getCoordinates().toString();
    }
}
