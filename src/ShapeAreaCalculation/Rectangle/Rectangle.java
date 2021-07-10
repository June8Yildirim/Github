package ShapeAreaCalculation.Rectangle;

import ShapeAreaCalculation.Shape;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height, String shape) {
        super(shape);
        this.length = length;
        this.height = height;
        shape = "Rectangle";
    }

    public double calculateArea(){
        return length * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height+length);
    }
}