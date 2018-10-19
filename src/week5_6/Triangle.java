package week5_6;

public class Triangle extends Shape {
    private double a, b, c;
    Coordinates coordinates;

    public void setTriangle(double a, double b, double c) {
        do {
            this.a = a;
            this.b = b;
            this.c = c;
        } while (this.check(a, b, c));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle() {
        a = 6;
        b = 8;
        c = 10;
    }

    public Triangle(double a, double b, double c, double x, double y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.check(a, b, c);
    }

    public Triangle(double a, double b, double c, double x, double y, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
        coordinates = new Coordinates(x, y);
        this.check(a, b, c);
    }

    public static boolean check(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b)
            return true;
        System.out.println("That is not Trangle!! :) ");
        return false;
    }

    public void moveTo(double x, double y) {
        coordinates = new Coordinates(x, y);
    }

    @Override
    public String toString() {
        return "Triangle: (a = " + a + ", b = " + b + ", c = " + c + ")\n";
    }

    @Override
    public String Coordinates() {
        return coordinates.toString();
    }

}
