public class Employee implements Sortable {
    // Isi class Employee sama persis dengan versi Abstract Class
    private String name;
    private double salary;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        this.name = n;
        this.salary = s;
        this.hireyear = year;
    }
    
    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("Name: " + name + " | Salary: " + salary);
    }

    public void raiseSalary(double byPercent) {
        this.salary *= 1 + byPercent / 100;
    }

    @Override
    public int compare(Sortable b) {
        Employee other = (Employee) b;
        if (this.salary < other.salary) {
            return -1;
        }
        if (this.salary > other.salary) {
            return 1;
        }
        return 0;
    }
}