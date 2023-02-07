package staffBook;

public class Employee {
    private static int idGenerator = 1;
    private final String fullName;
    private int department;
    private double salary;
    private int id;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idGenerator++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID:" + this.id + " " + this.fullName + " Department:" + this.department + " Salary:" + this.salary;
    }
}
