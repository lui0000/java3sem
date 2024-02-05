package mvs.myPackage1;

public class Employee {
    private String Employee;
    private Double HourlyRate;
    private Integer HoursWorked;

    public Employee(String Employee, double HourlyRate, int HoursWorked) {
        this.Employee = Employee;
        this.HourlyRate = HourlyRate;
        this.HoursWorked = HoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.HoursWorked = hoursWorked;
    }
    public void setEmployee(String employee) {
        Employee = employee;
    }

    public void setHourlyRate(Double hourlyRate) {
        HourlyRate = hourlyRate;
    }
    public Integer getHoursWorked() {
        return HoursWorked;
    }
    public String getEmployee() {
        return Employee;
    }

    public Double getHourlyRate() {
        return HourlyRate;
    }
    public Double calculateSalary() {
        return HourlyRate * HoursWorked;
    }
}
