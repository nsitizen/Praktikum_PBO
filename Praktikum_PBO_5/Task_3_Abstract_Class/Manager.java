import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
    }

    @Override
    public void raiseSalary(double byPercent) {
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        // Bonus tidak disertakan agar fokus pada sorting
        super.raiseSalary(byPercent);
    }
}