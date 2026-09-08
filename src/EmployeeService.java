public class EmployeeService {
    private EmployeeRepo repo;
    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }
    public void saveEmployee(Employee employee) {
        repo.save(employee);
    }
}
