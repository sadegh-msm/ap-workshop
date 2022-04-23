package withoutInheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Double> sides;

    public Rectangle(double edge1, double edge2, double edge3, double edge4) {
        sides = new ArrayList<Double>();
        addSide(edge1, edge2, edge3, edge4);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public void addSide(double edge1, double edge2, double edge3, double edge4) {
        if (isRectangle(edge1, edge2, edge3, edge4)){
            sides.add(edge1);
            sides.add(edge2);
            sides.add(edge3);
            sides.add(edge4);
        } else {
            System.out.println("there is no rectangle with this info");
        }
    }

    private boolean isRectangle(double e1, double e2, double e3, double e4){
        if(e1 == e3 && e2 == e4) {
            return true;
        }
        return false;
    }

    public boolean isSquare(){
        if(sides.get(0) == sides.get(1) && sides.get(2) == sides.get(3)) {
            return true;
        }
        return false;
    }

    public double calculatePerimeter(){
        return 2 * (sides.get(0) + sides.get(1));
    }

    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    public void draw(){
        System.out.println(isSquare() ? "square" : "rectangle" +
                ",\tperimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                ",\tarea: " + new DecimalFormat().format(calculateArea()));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }
}
