public class EmployeeRepository {

    public void save(Employee employee) {
        System.out.println(
            "Employee " + employee.getId() +
            " saved to database."
        );
    }
}