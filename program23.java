// Shape class (Superclass)
class Shape {
    // Method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0; // Default implementation for Shape
    }
}

// Rectangle class (Subclass)
class Rectangle extends Shape {
    // Data members
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle class (Subclass)
class Circle extends Shape {
    // Data member
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method overriding to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class (Subclass)
class Square extends Shape {
    // Data member
    double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Method overriding to calculate area for Square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Main class to test the implementation
public class program23 {
    public static void main(String[] args) {
        // Creating instances of Rectangle, Circle, and Square
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        Square square = new Square(5);

        // Calculating and printing areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}

