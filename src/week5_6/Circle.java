package week5_6;

public class Circle extends Shape {
    private double radius;
    private Coordinates coordinates;
    private final double Pi = Math.PI;

    public Circle() {
        radius = 1.0;
        coordinates = new Coordinates(0, 0);
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        coordinates = new Coordinates(x, y);
    }

    public Circle(double radius, double x, double y, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        coordinates = new Coordinates(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double x, double y) {
        coordinates = new Coordinates(x, y);
    }

    @Override
    public void moveTo(double x, double y) {
        setCoordinates(x, y);
    }

    @Override
    public String toString() {
        return "Circle: (radius = " + radius + ")\n";

    }

    @Override
    public String Coordinates() {
        return coordinates.toString();
    }
}
