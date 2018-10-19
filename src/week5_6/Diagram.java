package week5_6;

public class Diagram  {

    public void deleteAllCircle(Layer layer){
        for(int i = 0; i < layer.shapeList.size(); i++){
            if(layer.shapeList.get(i) instanceof  Circle)
                layer.shapeList.remove(i);
            i--;
        }
    }

    public static void toString(Layer layer){
        String s = "";
        for(int i  = 0 ; i < layer.shapeList.size(); i++) {
            System.out.println(layer.shapeList.get(i).toString());
        }

    }
    public  static void main(String [] args){
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        diagram = layer;
        layer.shapeList.add(new Rectangle(6.0, 8.0, "blue", true , 1, 1));
        layer.shapeList.add(new Triangle(2.0,3.0,4.0, 5.0,6.0, "black", true));
        layer.shapeList.add(new Circle(3, 1,2, "red", true ));
        toString(layer);

    }

}