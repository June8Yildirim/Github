package ShapeAreaCalculation.CircularShape;

import ShapeAreaCalculation.Shape;

public class CircularShape extends Shape {

    private double radius;

    public CircularShape(double radius, String shape){
        super(shape);
        shape="Circle";
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }


    public double calculateDiameter() {
        return this.radius * 2;
    }

}
