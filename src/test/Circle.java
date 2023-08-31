package test;

public class Circle extends Shape {
    private float lengthsCircle;

    public float getLengthsCircle() {
        return lengthsCircle;
    }

    public void setLengthsCircle(float lengthsCircle) {
        this.lengthsCircle = lengthsCircle;
    }

    public Circle(String name, float lengthsCircle){
        super(name);
        this.lengthsCircle = lengthsCircle;
    }

    public Circle(String name) {
        super(name);
    }

    @Override
    public void print() {
        areaCount();
        System.out.println("Circle " + super.getName() + " area " + area);
    }

    @Override
    public void areaCount() {
        area = (float) (lengthsCircle * 2 * Math.PI);
    }

}

