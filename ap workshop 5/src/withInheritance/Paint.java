package withInheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class Paint {
    private ArrayList<Shape> shapes;

    public Paint(Shape shape) {
        shapes = new ArrayList<Shape>();
        shapes.add(shape);
    }

    public Paint() {

    }

    public void drawAll(){
        Iterator<Shape> shapeIterator = shapes.iterator();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        while (shapeIterator.hasNext()){
            Shape temp = shapeIterator.next();
            if(temp instanceof Circle)
                flag1 = true;
            if (temp instanceof Triangle)
                flag2 = true;
            if (temp instanceof Rectangle)
                flag3 = true;
        }
        int counter = 1;
        if(flag1){
            System.out.println("circles:");
            for (Shape temp : shapes) {
                if (temp instanceof Circle) {
                    System.out.println(counter + ")");
                    temp.draw();
                    counter++;
                }
            }
            System.out.println(".........................................");
        }
        if(flag2){
            System.out.println("triangles:");
            counter = 1;
            for (Shape temp : shapes) {
                if (temp instanceof Triangle) {
                    System.out.println(counter + ")");
                    temp.draw();
                    counter++;
                }
            }
            System.out.println(".........................................");
        }
        if(flag3){
            System.out.println("rectangles:");
            counter = 1;
            for (Shape temp : shapes) {
                if (temp instanceof Rectangle) {
                    System.out.println(counter + ")");
                    temp.draw();
                    counter++;
                }
            }
        }
    }
}
