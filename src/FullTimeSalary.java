public class FullTimeSalary implements SalaryCalculation {
    public double calculate(Employee employee) {
        return employee.getSalary();
    }
}
