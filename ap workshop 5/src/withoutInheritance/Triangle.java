package withoutInheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    private ArrayList<Double> sides;

    public Triangle(double edge1, double edge2, double edge3){
        sides = new ArrayList<>(3);
        addNewSide(edge1,edge2,edge3);
    }

    public void addNewSide(double edge1, double edge2, double edge3) {
        if (isTriangle(edge1, edge2, edge3) == true) {
            sides.add(edge1);
            sides.add(edge2);
            sides.add(edge3);
        } else {
            System.out.println("there is no triangle with this info");
        }
    }

    public boolean isTriangle(double edge1, double edge2, double edge3) {
        if(edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2) {
            return false;
        }
        return true;
    }

    public boolean isEquilateral(){
        return sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    public double calculateArea(){
        double p = calculatePerimeter() / 2;
        return Math.pow( ( p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)) ), 0.5);
    }

    public void draw(){
        System.out.println(isEquilateral() ? "equilateral" : "" + "triangle" +
                ",\tperimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                ",\tarea: " + new DecimalFormat().format(calculateArea()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

}
