public class PartTimeSalary implements SalaryCalculation{
    public double calculate(Employee employee) {
        return employee.getSalary() * 0.5;
    }
}
