public class ContractSalary implements SalaryCalculation{
    public double calculate(Employee employee) {
        return employee.getSalary();
    }
}
