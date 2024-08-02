package exercise10;

public class MVCTest {
 public static void main(String[] args) {
     // Create a student
     Student student = new Student("John Doe", 123, 85.0);

     // Create a student view
     StudentView studentView = new StudentView();

     // Create a student controller
     StudentController studentController = new StudentController(student, studentView);

     // Display initial student details
     System.out.println("Initial Student Details:");
     studentController.displayStudentDetails();

     // Update student details
     studentController.updateStudentName("Jane Doe");
     studentController.updateStudentId(456);
     studentController.updateStudentGrade(90.0);

     // Display updated student details
     System.out.println("\nUpdated Student Details:");
     studentController.displayStudentDetails();
 }
}
