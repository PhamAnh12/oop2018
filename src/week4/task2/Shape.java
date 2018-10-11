package week4.task2;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        if (filled == true)
            return true;
        return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "\nColor: " + color
                + "\nFilled: " + filled;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(3);
        System.out.println(circle.toString());
        System.out.println("---------------------------------");
        System.out.println(rectangle.toString());
        System.out.println("---------------------------------");
        System.out.println(square.toString());

    }
}