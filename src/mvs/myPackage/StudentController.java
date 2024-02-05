package mvs.myPackage;

public class StudentController {
    //Model Object
    // View Object
    private final Student model;
    private final StudentView view;
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    // control model object
    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentRollNumber(String rollNo) {
        model.setRollNo(rollNo);
    }
    public String getStudentRollNumber() {
        return model.getRollNo();
    }
    public String getStudentName() {
        return model.getName();
    }
    //control view object
    public void updateView() {
        view.printStudentDetails(model.getName(),model.getRollNo());
    }
}
