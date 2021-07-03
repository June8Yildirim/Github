package CircularShape;

public class CircularShape {
    private double radius;

    public CircularShape(double rad){
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }

    public double calculateDiameter() {
        return this.radius*2;
    }

}
