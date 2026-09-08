// public class SalaryCalculator {
//     public double calculateSalary(Employee employee) {
//         return employee.getSalary();
//     }
// } //srp
//ocp
public class SalaryCalculator {
    private SalaryCalculation calculation;
    public SalaryCalculator(SalaryCalculation calculation) {
        this.calculation = calculation;
    }
    public double calculateSalary(Employee employee) {
        return calculation.calculate(employee);
    }
}
