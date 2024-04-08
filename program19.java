// Teacher class inheriting from Employee
class Teacher extends Employee {
    // Additional data members specific to Teacher
    String subject;
    String department;

    // Constructor to initialize data members of Teacher and Employee
    public Teacher(String name, char gender, String address, int age, int empId, String companyName,
                   String qualification, double salary, String subject, String department) {
        // Calling superclass constructor to initialize Employee's data members
        super(name, gender, address, age, empId, companyName, qualification, salary);

        // Initializing Teacher's data members
        this.subject = subject;
        this.department = department;
    }

    // Method to display teacher details
    public void displayTeacherDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: $" + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class program19 {
    public static void main(String[] args) {
        // Creating an instance of Teacher
        Teacher teacher = new Teacher("Jane Smith", 'F', "456 Park Ave, Town", 35, 2001,
                "XYZ School", "Master's", 60000.0, "Mathematics", "Science");

        // Displaying teacher details
        teacher.displayTeacherDetails();
    }
}

