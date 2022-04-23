package withInheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Polygon extends Shape{
    protected ArrayList<Double> sides;

    public Polygon(double... allSides) {
        sides = new ArrayList<Double>();
        for (double temp: allSides){
            sides.add(temp);
        }
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i<sides.size(); i++)
            perimeter += sides.get(i);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        if(this instanceof Rectangle)
            return 2 * sides.get(0) * sides.get(1);
        else if(this instanceof Triangle){
            double p = calculatePerimeter() / 2;
            return Math.pow( ( p * (p-sides.get(0)) * (p-sides.get(1)) * (p- sides.get(2)) ) , 0.5);
        }
        return -1;
    }

    @Override
    public void draw() {
        if(this instanceof Rectangle){
            System.out.println(((Rectangle) this).isSquare() ? "square-> " : "rectangle-> " +
                    "perimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                    ", area: " + new DecimalFormat().format(((Rectangle) this).calculateArea()));
        }
        else if(this instanceof Triangle){
            System.out.println(((Triangle) this).isEquilateral() ? "equilateral " : "" + "triangle-> " +
                    "perimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                    ", area: " + new DecimalFormat().format(((Triangle) this).calculateArea()));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Polygon)) return false;
        Polygon polygon = (Polygon) obj;
        return Objects.equals(getSides(), polygon.getSides());
    }

    @Override
    public String toString() {
        if(this instanceof Rectangle){
            StringBuilder sidesValues= new StringBuilder();
            int count = 1;
            for (double temp : getSides()){
                sidesValues.append(", side").append(count).append(": ").append(getSides().get(count - 1));
                count++;
            }
            return ((Rectangle) this).isSquare() ? "square" : "rectangle" + sidesValues;
        }
        else if(this instanceof Triangle){
            StringBuilder sidesValues = new StringBuilder();
            int count = 1;
            for (double temp : getSides()){
                sidesValues.append(", side").append(count + ":").append(getSides().get(count - 1));
                count++;
            }
            return ((Triangle) this).isEquilateral() ? "equilateral " : "" + "triangle" + sidesValues;
        }
        return "";
    }
}
