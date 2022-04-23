package withInheritance;

public class Triangle extends Polygon{
    public Triangle(double... side){
        addSide(side[0], side[1], side[2]);
    }

    public boolean isEquilateral(){
        return sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2);
    }

    private void addSide(double e1, double e2, double e3){
        if(isTriangle(e1,e2,e3)){
            sides.add(e1);
            sides.add(e2);
            sides.add(e3);
        } else {
            System.out.println("there is no triangle with this info");
        }
    }

    private boolean isTriangle(double e1, double e2, double e3){
        if(e1 + e2 <= e3 || e2 + e3 <= e1 || e1 + e3 <= e2) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Polygon polygon = (Polygon) o;
        return super.equals(o);
    }

}
