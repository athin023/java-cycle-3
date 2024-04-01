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
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    // Constructor to initialize Teacher data members
    public Teacher(String name, char gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Display method to print teacher details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an array of Teacher objects
        Teacher[] teachers = new Teacher[3];
        
        // Initializing Teacher objects
        teachers[0] = new Teacher("John Doe", 'M', "123 Street Ave", 35, 1001, "ABC School", "Ph.D.", 60000.00, "Mathematics", "Science", 2001);
        teachers[1] = new Teacher("Jane Smith", 'F', "456 Avenue Rd", 40, 1002, "XYZ School", "Masters", 55000.00, "English", "Humanities", 2002);
        teachers[2] = new Teacher("Michael Johnson", 'M', "789 Boulevard", 38, 1003, "DEF School", "Bachelor's", 50000.00, "Physics", "Physics", 2003);
        
        // Displaying details of all teachers
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }
    }
}
