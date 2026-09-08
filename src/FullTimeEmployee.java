public class FullTimeEmployee extends Employee implements RemoteWork{
    public FullTimeEmployee(int id, String name, double salary) {
        super(id,name,salary);
    }
    public void workFromHome() {
        System.out.println(getName() + " is working from home");
    }
}
