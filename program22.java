// Interface Shape
interface Shape {
    double area();
    double calculateCost();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    // Data member
    double radius;
    double costPerUnit;

    // Constructor to initialize data members
    public Circle(double radius, double costPerUnit) {
        this.radius = radius;
        this.costPerUnit = costPerUnit;
    }

    // Method to calculate area of circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate cost of circle
    public double calculateCost() {
        return area() * costPerUnit;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    // Data members
    double length;
    double width;
    double costPerUnit;

    // Constructor to initialize data members
    public Rectangle(double length, double width, double costPerUnit) {
        this.length = length;
        this.width = width;
        this.costPerUnit = costPerUnit;
    }

    // Method to calculate area of rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate cost of rectangle
    public double calculateCost() {
        return area() * costPerUnit;
    }
}

// Bill class to generate a bill
class Bill {
    // Method to generate bill for a shape
    public void generateBill(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.area());
        System.out.println("Cost: $" + shape.calculateCost());
        System.out.println("--------------------------");
    }
}

// Main class to test the implementation
public class program22 {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5, 2); // radius = 5, costPerUnit = 2
        Rectangle rectangle = new Rectangle(4, 6, 3); // length = 4, width = 6, costPerUnit = 3

        // Creating an instance of Bill
        Bill bill = new Bill();

        // Generating bill for Circle
        bill.generateBill(circle);

        // Generating bill for Rectangle
        bill.generateBill(rectangle);
    }
}

