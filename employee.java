import java.util.Scanner;

// Employee class
class Employee {
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;

    // Constructor to initialize data members
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // Display function to display employee details
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}

// Teacher class inheriting from Employee
class Teacher extends Employee {
    private String department;
    private String subjectsTaught;

    // Constructor to initialize data members
    public Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Override display function to display teacher details
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();

        // Create an array of Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Subjects Taught: ");
            String subjectsTaught = scanner.nextLine();

            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }

        // Display details of all teachers
        System.out.println("\nDetails of all teachers:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1) + ":");
            teachers[i].display();
        }

        scanner.close();
    }
}
