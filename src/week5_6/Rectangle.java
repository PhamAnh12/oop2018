package week5_6;

public class Rectangle extends Shape {
    private double width, length;
    Coordinates coordinates;

    public void setRectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public void setCoordinates(double x, double y) {
        coordinates = new Coordinates(x, y);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Rectangle() {
        width = 1.0;
        length = 2.0;
        coordinates = new Coordinates(0, 0);
    }

    public Rectangle(double width, double length, double x, double y) {
        this.width = width;
        this.length = length;
        coordinates = new Coordinates(x, y);
    }

    public Rectangle(double width, double length, String color, boolean filled, double x, double y) {
        super(color, filled);
        this.width = width;
        this.length = length;
        coordinates = new Coordinates(x, y);
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "Rectangle(Width: " + width + ", Length: " + length + ",Color: " + getColor() + ")\n";
    }

    public void moveTo(double x, double y) {
        setCoordinates(x, y);
    }

    public String Coordinates() {
        return coordinates.toString();
    }
}