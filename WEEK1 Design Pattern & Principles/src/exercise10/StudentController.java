package exercise10;

public class StudentController {
 private Student model;
 private StudentView view;

 public StudentController(Student model, StudentView view) {
     this.model = model;
     this.view = view;
 }

 public void updateStudentName(String name) {
     model.setName(name);
 }

 public void updateStudentId(int id) {
     model.setId(id);
 }

 public void updateStudentGrade(double grade) {
     model.setGrade(grade);
 }

 public void displayStudentDetails() {
     view.displayStudentDetails(model);
 }
}