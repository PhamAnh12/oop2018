
package week4.task2;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color,filled,side);
    }
    public Square(double side){
        super(side,side);
    }
    public Square() {
    }
    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString() + "Hinh vuong";
    }

}


