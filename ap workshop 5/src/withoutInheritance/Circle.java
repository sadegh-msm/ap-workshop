package withoutInheritance;

import java.text.DecimalFormat;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double calculatePerimeter() {
        return radius * Math.PI * 2;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    public void draw() {
        System.out.println("circle" + ",\tperimeter: " + new DecimalFormat().format(calculatePerimeter()) +
                ",\tarea: " + new DecimalFormat().format(calculateArea()));
    }
}
