public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"ritu",50000);
        employee.calculateSalary();
        employee.generateReport();
        employee.saveToDatabase();
    }
}
