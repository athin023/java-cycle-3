// Interface Shape
interface Shape {
    double area();
    double perimeter();
}

// Student class
class Student {
    // Data members
    String studentName;
    int academicScore;

    // Constructor to initialize data members of Student
    public Student(String studentName, int academicScore) {
        this.studentName = studentName;
        this.academicScore = academicScore;
    }
}

// Sports class
class Sports {
    // Data members
    int sportsScore;

    // Constructor to initialize data members of Sports
    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }
}

// Result class inheriting from Student and Sports
class Result extends Student {
    // Composition of Sports class
    Sports sports;

    // Constructor to initialize data members of Result and Student
    public Result(String studentName, int academicScore, int sportsScore) {
        // Calling superclass constructor to initialize Student's data members
        super(studentName, academicScore);
        // Creating instance of Sports to incorporate sports score
        this.sports = new Sports(sportsScore);
    }

    // Method to display academic and sports score
    public void displayResult() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sports.sportsScore);
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    // Data member
    double radius;

    // Constructor to initialize data member
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter of circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    // Data members
    double length;
    double width;

    // Constructor to initialize data members
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the implementation
public class program21 {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Menu-driven program to find area and perimeter of objects
        System.out.println("Menu:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("Enter your choice:");

        int choice = 2; // Change the choice as needed

        switch (choice) {
            case 1:
                System.out.println("Area of Circle: " + circle.area());
                System.out.println("Perimeter of Circle: " + circle.perimeter());
                break;
            case 2:
                System.out.println("Area of Rectangle: " + rectangle.area());
                System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

