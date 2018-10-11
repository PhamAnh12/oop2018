package week4.task2;

public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = Math.PI;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle\nRadius: " + radius
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter()
                + super.toString() + "\n";
    }
}