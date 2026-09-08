public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"ritu",50000);
        SalaryCalculation calculation = new FullTimeSalary();
        SalaryCalculator calculator = new SalaryCalculator(calculation);
        EmployeeReport report = new EmployeeReport();
        EmployeeRepository repository = new EmployeeRepository();
        System.out.println("Salary: " +calculator.calculateSalary(employee));
        report.generateReport(employee);
        repository.save(employee);
    }
}
