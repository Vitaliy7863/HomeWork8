package test;

public class Main {
    public static void main(String[] args) {
        Shape quad = new Quad("Q1");
        Shape quad2 = new Quad( "Q2",5);
        Shape circle = new Circle("C1");
        Shape circle2 = new Circle("C2",2.3f);
        Shape rectangle = new Rectangle("R1");
        Shape rect = new Rectangle("R2", 2,3);
        Shape trapeze = new Trapeze("T1");
        Shape tr = new Trapeze("Herodot", 6.6f , 3 , 4);
        Shape triangle = new Triangle("Triangle");
        Shape Hrek = new Triangle("Pifahor", 5 , 6.5f);

        Printer printer = new Printer(quad);
        printer.printData();

        printer.setShape(quad2);
        printer.printData();

        printer.setShape(circle);
        printer.printData();

        printer.setShape(circle2);
        printer.printData();

        printer.setShape(rectangle);
        printer.printData();

        printer.setShape(rect);
        printer.printData();

        printer.setShape(trapeze);
        printer.printData();

        printer.setShape(tr);
        printer.printData();

        printer.setShape(triangle);
        printer.printData();

        printer.setShape(Hrek);
        printer.printData();
    }
}