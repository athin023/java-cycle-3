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
class Result extends Student, Sports {
    // Constructor to initialize data members of Result, Student, and Sports
    public Result(String studentName, int academicScore, int sportsScore) {
        // Calling superclass constructors to initialize data members
        super(studentName, academicScore);
        super(sportsScore);
    }

    // Method to display academic and sports score
    public void displayResult() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Main class to test the implementation
public class program20 {
    public static void main(String[] args) {
        // Creating an instance of Result
        Result result = new Result("John", 85, 90);

        // Displaying academic and sports score
        result.displayResult();
    }
}

