package ShapeAreaCalculation;

public abstract class Shape {
    private String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


}
