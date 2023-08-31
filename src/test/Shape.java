package test;

public abstract class Shape implements WorkingShape {
    private String name;
    protected float area;
    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
