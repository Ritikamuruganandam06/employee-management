public class Main {
    public static void main(String[] args) {
        // Employee employee = new Employee(101,"ritu",50000);
        // SalaryCalculation calculation = new FullTimeSalary();
        // SalaryCalculator calculator = new SalaryCalculator(calculation);
        // EmployeeReport report = new EmployeeReport();
        // EmployeeRepository repository = new EmployeeRepository();
        // System.out.println("Salary: " +calculator.calculateSalary(employee));
        // report.generateReport(employee);
        // repository.save(employee);
        //lsp
        // Employee fullTime = new FullTimeEmployee(101, "John", 50000);
        // Employee partTime = new PartTimeEmployee(102, "David", 30000);
        // fullTime.work();
        // partTime.work();
        // RemoteWork remoteEmployee = new FullTimeEmployee(101, "John", 50000);
        // remoteEmployee.workFromHome();
        //dip
        Employee employee = new Employee(101,"ritu",50000);
        EmployeeRepo repo = new MySQLDatabase();
        EmployeeService service = new EmployeeService(repo);
        EmployeeRepo repo1 = new MongoDatabase();
        EmployeeService service1 = new EmployeeService(repo1);
        service1.saveEmployee(employee);
        service.saveEmployee(employee);
    }
}
