import java.util.Scanner;

// StudentRecord class 
class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// StudentApp class with main method
public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        // Instantiate StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display student details
        student.displayInfo();

        scanner.close();
    }
}
