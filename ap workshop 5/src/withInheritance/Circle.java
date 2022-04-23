package withInheritance;

import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void draw() {
        System.out.println("circle-> " + "perimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                ", area: " + new DecimalFormat().format(calculateArea()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
