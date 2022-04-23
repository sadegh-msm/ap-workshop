package withoutInheritance;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;

    public Paint() {
        circles = new ArrayList<Circle>();
        triangles = new ArrayList<Triangle>();
        rectangles = new ArrayList<Rectangle>();
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void drawAll(){
        int counter = 1;
        System.out.println("triangles :");
        for (Triangle temp : triangles) {
            System.out.print(counter + ")\t");
            temp.draw();
            counter++;
        }
        counter = 1;
        System.out.println("rectangles :");
        for (Rectangle temp : rectangles){
            System.out.print(counter + ")\t");
            temp.draw();
            counter++;
        }
        counter = 1;
        System.out.println("circles :");
        for (Circle temp : circles){
            System.out.print(counter + ")\t");
            temp.draw();
            counter++;
        }
    }

    public void printAll(){
        int counter = 1;
        System.out.println("triangles:");
        for (Triangle temp : triangles) {
            System.out.println(counter + ")\t" + temp.toString());
            counter++;
        }
        counter = 1;
        System.out.println("rectangles:");
        for (Rectangle temp : rectangles){
            System.out.println(counter + ")\t" + temp.toString());
            counter++;
        }
        counter = 1;
        System.out.println("circles");
        for (Circle temp : circles){
            System.out.println(counter + ")\t" + temp.toString());
            counter++;
        }
    }
}
