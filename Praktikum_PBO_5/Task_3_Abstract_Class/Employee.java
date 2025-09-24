public class Employee extends Sortable {
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

    /**
     * Implementasi method abstract 'compare' dari Sortable.
     * Mengembalikan -1 jika gaji objek ini lebih kecil, 1 jika lebih besar, 0 jika sama.
     */
    @Override
    public int compare(Sortable b) {
        Employee other = (Employee) b; // Downcast ke Employee
        if (this.salary < other.salary) {
            return -1;
        }
        if (this.salary > other.salary) {
            return 1;
        }
        return 0;
    }
}