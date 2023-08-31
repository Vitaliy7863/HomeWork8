package test;

public class Quad extends Shape {
    private float side;

    public Quad(String name, float side) {
        super(name);
        this.side = side;
    }

    public Quad(String name) {
        super(name);
    }

    @Override
    public void areaCount() {
        area = side * side;
    }

    @Override
    public void print() {
        areaCount();
        System.out.println("Quad " + super.getName()  + " area " + area);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}
