public class MySQLDatabase implements EmployeeRepo{
    public void save(Employee employee) {
        System.out.println("employee saved to Mysql db");
    }
}
