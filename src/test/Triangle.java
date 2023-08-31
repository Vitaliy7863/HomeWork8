package test;

public class Triangle extends Shape {
    private float sideA;
    private float heightA;

    public Triangle(String name, float sideA, float heightA) {
        super(name);
        this.sideA = sideA;
        this.heightA = heightA;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        areaCount();
        System.out.println("Triangle " + super.getName() + " area " + area);
    }

    @Override
    public void areaCount() {
        area = sideA * heightA / 2;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getHeightA() {
        return heightA;
    }

    public void setHeightA(float heightA) {
        this.heightA = heightA;
    }
}
