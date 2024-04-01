class Person {
    String name;
    char gender;
    String address;
    int age;

    // Constructor to initialize data members
    public Person(String name, char gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor to initialize Employee data members
    public Employee(String name, char gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

    // Display method to print employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 'M', "123 Street Ave", 30, 1001, "ABC Company", "Bachelor's Degree", 50000.00);
        
        // Displaying employee details
        emp.display();
    }
}
