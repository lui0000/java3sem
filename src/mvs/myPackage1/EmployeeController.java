package mvs.myPackage1;

import myPackage.Student;
import myPackage.StudentView;

public class EmployeeController {
    //Model Object
    // View Object
    private final Employee model;
    private final EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    // control model object
    public void setEmployeeName(String name) {
        model.setEmployee(name);
    }
    public void setEmployeeHoursWorked(Integer hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }
    public void setEmployeeHourlyRate(Double  hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }
    public String getEmployeeName() {
        return model.getEmployee();
    }
    public Integer getEmployeeHoursWorked() {
        return model.getHoursWorked();
    }
    public Double getEmployeeHourlyRate() {
        return model.getHourlyRate();
    }
    //control view object
    public void updateView() {
        view.printStudentDetails(model.getEmployee(),model.calculateSalary());
    }

}
