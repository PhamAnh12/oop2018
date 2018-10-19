package week4.task2;

public class Rectangle extends Shape {
    protected double width = 1.0, length = 1.0;

    //Contructor
    public
    Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    //Contructor
    public
    Rectangle() {
    }

    //Contructor
    public
    Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public
    Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString() + "Chieu dai: " + width + " Chieu rong: " + length;
    }
}
