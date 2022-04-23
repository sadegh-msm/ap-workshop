package withInheritance;

public class Rectangle extends Polygon {
    public Rectangle(double... side) {
        addSide(side[0], side[1], side[2], side[3]);
    }

    private void addSide(double e1, double e2, double e3, double e4){
        if(isRectangle(e1, e2, e3, e4)){
            sides.add(e1);
            sides.add(e2);
            sides.add(e3);
            sides.add(e4);
        } else {
            System.out.println("there is no triangle with this info");
        }
    }

    public boolean isSquare(){
        return sides.get(0) == sides.get(1) && sides.get(2) == sides.get(3);
    }

    private boolean isRectangle(double e1, double e2, double e3, double e4){
        if(e1 == e3 && e2 == e4) {
            return true;
        }
        return false;
    }

    private void addNewSide(double e1, double e2, double e3, double e4) {
        if (isRectangle(e1, e2, e3, e4)) {
            sides.add(e1);
            sides.add(e2);
            sides.add(e3);
            sides.add(e4);
        } else {
            System.out.println("there is no rectangle with this info");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Polygon polygon = (Polygon) o;
        return super.equals(o);
    }
}
