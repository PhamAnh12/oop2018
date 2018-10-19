package week5_6;

public abstract class Shape {
    private String color = "red";
    private boolean filled = true;
    Coordinates coordinates;
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
    public abstract void moveTo(double x, double y);
    @Override
    public abstract String toString();
    public abstract String Coordinates();
}
