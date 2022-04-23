package withInheritance;

public abstract class Shape extends Paint{
    public Shape(Shape shape) {
        super(shape);
    }

    public Shape() {
        super();
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract void draw();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();
}