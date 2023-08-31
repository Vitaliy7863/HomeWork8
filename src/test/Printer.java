package test;

public class Printer {
    private Shape shape;

    public Printer(Shape shape) {
        this.shape = shape;
    }

    void printData() {
        shape.print();
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

}
