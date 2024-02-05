package mvs.myPackage1;

import java.util.ArrayList;
import java.util.List;

public class DemoMVCPattern {
    public static void main(String[] args) {
        List<Employee> employees = retrieveEmployeesFromDatabase();

        // first student
        Employee model = employees.get(0);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        controller.setEmployeeName("Mike Delfino");
        controller.setEmployeeHoursWorked(9);
        controller.setEmployeeHourlyRate(999.9);
        controller.updateView();

        // Displaying information for all students
        for (Employee employee : employees) {
            EmployeeView employeeView = new EmployeeView();
            EmployeeController employeeController = new EmployeeController(employee, employeeView);
            employeeController.updateView();
        }
    }

    private static List<Employee> retrieveEmployeesFromDatabase() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("Sam Nilsen", 1000.0, 8);
        employees.add(employee1);

        Employee employee2 = new Employee("Frank Ocean", 1500.0, 4);
        employees.add(employee2);
        Employee employee3 = new Employee("Bree van de Kamp", 2000.0, 10);
        employees.add(employee3);

        Employee employee4 = new Employee("Mary Alice Young", 500.0, 7);
        employees.add(employee4);

        return employees;
    }
}
