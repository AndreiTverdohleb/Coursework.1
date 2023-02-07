package staffBook;

public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Лукьянова Ольга Валерьевна",1,150_000.0);
        employees[1] = new Employee("Нефёдова Алена Викторовна",3,70_000.0);
        employees[2] = new Employee("Нефёдов Виктор Алексеевич",4,80_000.0);
        employees[3] = new Employee("Фуртель Сергей Николаевич",5,75_000.0);
        employees[4] = new Employee("Максимова Татьяна Борисовна",5,90_000.0);
        printEmployees();
        printSum();
        printEmployeeWithMinSalary();
        printEmployeeWithMaxSalary();
        printSalaryAverage();
        printNames();
    }

    private static void printEmployees(){
        for (Employee employee:employees){
            if (employee != null){
                System.out.println(employee);
            }
        }
    }

    private static void printSum(){
        double sum = 0;
        for(Employee employee:employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Salary sum:" + sum);}

    private static void printEmployeeWithMinSalary(){
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for(Employee employee:employees){
            if (employee != null && employee.getSalary() < min){
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("employee with min salary:"+employeeWithMinSalary);}

    private static void printEmployeeWithMaxSalary(){
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for(Employee employee:employees){
            if (employee != null && employee.getSalary() > max){
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("employee with max salary:"+employeeWithMaxSalary);}

    private static void printSalaryAverage(){
        double sum = 0;
        int count = 0;
        for(Employee employee:employees){
            if(employee != null){
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Average salary "+ sum / count);}

    private static void printNames() {
        for (Employee employee : employees)
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
    }
}