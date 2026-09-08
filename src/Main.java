public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"ritu",50000);
        SalaryCalculator calculator = new SalaryCalculator();
        EmployeeReport report = new EmployeeReport();
        EmployeeRepository repository = new EmployeeRepository();
        System.out.println("Salary: " +calculator.calculateSalary(employee));
        report.generateReport(employee);
        repository.save(employee);
    }
}
