package week5_6;

public class Coordinates {
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public
    Coordinates() {
        x = 0;
        y = 0;
    }

    public
    Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public
    String toString() {
        return "Coordinates: " + "(" + x + ", " + y + ")";
    }

}
