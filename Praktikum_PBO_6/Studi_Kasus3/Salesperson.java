package Praktikum_PBO_6.Studi_Kasus3;

//****************************************************************
//  Salesperson.java
//
//  Represents a sales person who has a first name, last
//  name, and total number of sales.
//****************************************************************
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Returns the sales person as a string.
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    // Returns true if the sales people have the same name.
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    //-----------------------------------------------------------------
    //  Order is based on total sales with the name (last, then first)
    //  breaking a tie. (Dilengkapi)
    //-----------------------------------------------------------------
    public int compareTo(Object other) {
        int result;
        Salesperson otherSalesperson = (Salesperson) other;

        // Kunci utama: total sales.
        // Logika ini untuk urutan menaik (ascending).
        // Karena insertionSort sudah diubah jadi menurun, logika compareTo tetap menaik
        // agar hasilnya sesuai (tertinggi ke terendah).
        result = this.totalSales - otherSalesperson.getSales();

        // Kunci kedua (tie-breaker): nama, secara reverse alphabetical.
        if (result == 0) {
            String thisName = this.lastName + this.firstName;
            String otherName = otherSalesperson.getLastName() + otherSalesperson.getFirstName();
            // otherName.compareTo(thisName) untuk urutan reverse alphabetical (Z-A)
            result = otherName.compareTo(thisName);
        }

        return result;
    }

    // Accessor methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSales() {
        return totalSales;
    }
}