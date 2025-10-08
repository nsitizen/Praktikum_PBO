package Praktikum_PBO_6.Studi_Kasus1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commission;
        this.totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPayment = super.pay(); 
        double commissionPayment = this.totalSales * this.commissionRate;
        double totalPayment = hourlyPayment + commissionPayment;
        
        this.totalSales = 0; 
        
        return totalPayment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + this.totalSales;
        return result;
    }
}