package week4.task2;

public class Shape {
    protected String Color = "red";
    protected boolean filled = true;

    public Shape(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "Color: " + this.Color + "Filled: " + (filled == true ? "yes" : "no");
    }
    public  static void main(String [] args){


    }
}
