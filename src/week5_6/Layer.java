package week5_6;

import java.util.ArrayList;

public class Layer extends Diagram{
    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void deleteAllTriangle(){
        for(int i = 0; i < shapeList.size(); i++){
            if(shapeList.get(i) instanceof  Triangle)
                shapeList.remove(i);
            i--;
        }
    }

}
