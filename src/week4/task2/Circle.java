
package week4.task2;

public class Circle extends Shape {
    private double radius = 1.0;
    static final double PI = 3.14;
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Tinh dien tich
    public double getArea(){
        return radius*radius*PI;
    }
    //Tinh chu vi
    public double getPerimeter(){
        return 2*this.radius*PI;
    }
    //Viet lai phuong thuc toString tu Shape

    @Override
    public String toString() {
        return super.toString() + "Radius: " + radius + "Area: " + getArea() + "Perimeter: " + getPerimeter();
    }
}
