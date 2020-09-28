package open_closed_principle;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

// the problem here is we need to modify every time we introduce new class
// for the calculation of a different shape
// the solution is to create a interface that defines the method so we can expand by the class when we want to implement it
/*class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle) {
        return (22/7) * circle.radius * circle.radius;
    }
}*/

// this is open for extensions
// more shapes can be added without modifying the existing code
// we don't need to modify every time we add a new shape
class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

// because the shape is the base providing method
// and this class implements the interface
// we can provide or extensive implementation of the method based on our shape (same in the rectangle)
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * (22/7);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
