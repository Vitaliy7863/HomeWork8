package test;

public class Rectangle extends Shape {
    private float sideA;
    private float sideB;

    public Rectangle(String name, float sideA, float sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        areaCount();
        System.out.println("Rectangle " + super.getName() + " area " + area);
    }

    @Override
    public void areaCount() {
        area = sideA * sideB;
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
}
