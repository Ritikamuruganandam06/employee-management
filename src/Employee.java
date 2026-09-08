public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // public void calculateSalary() {
    //     System.out.println("salary: " + salary);
    // }
    // public void generateReport() {
    //     System.out.println("employee id: "+id);
    //     System.out.println("employee name: "+name);
    //     System.out.println("employee salary: "+salary);
    // }
    // public void saveToDatabase() {
    //     System.out.println("employee saved to database");
    // }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}