package ShapeAreaCalculation;

import ShapeAreaCalculation.CircularShape.CircularShape;
import ShapeAreaCalculation.Rectangle.Rectangle;

public class ShapeTester {

    public static void main(String[] args) {
        Rectangle sq = new Rectangle(12, 10, "Rectangle");

        CircularShape circular = new CircularShape(10, "Circle");

        System.out.println(sq.calculateArea());
        System.out.println(circular.calculateDiameter());
        System.out.println(sq.calculatePerimeter());
        System.out.println(circular.calculateDiameter());
    }
}
