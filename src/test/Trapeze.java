package test;

public class Trapeze extends Shape {
    private float sideA;
    private float sideB;
    private float height;

    public Trapeze(String name, float sideA, float sideB, float height) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public Trapeze(String name) {
        super(name);
    }

    @Override
    public void print() {
        areaCount();
        System.out.println("Trapeze " + super.getName() + " area " + area);
    }

    @Override
    public void areaCount() {
        area = (sideA + sideB) / 2 * height;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
