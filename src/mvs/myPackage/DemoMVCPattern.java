package mvs.myPackage;

import java.util.ArrayList;
import java.util.List;

public class DemoMVCPattern {
    public static void main(String[] args) {
        List<Student> students = retrieveStudentsFromDatabase();

        // first student
        Student model = students.get(0); // Select the first student from the list
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentRollNumber("3443");
        controller.setStudentName("Alice");
        controller.updateView();

        // Displaying information for all students
        for (Student student : students) {
            StudentView studentView = new StudentView();
            StudentController studentController = new StudentController(student, studentView);
            studentController.updateView();
        }
    }

    private static List<Student> retrieveStudentsFromDatabase() {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setName("Sam");
        student1.setRollNo("2525");
        students.add(student1);

        Student student2 = new Student();
        student2.setName("Frank");
        student2.setRollNo("1585");
        students.add(student2);

        return students;
    }
}
