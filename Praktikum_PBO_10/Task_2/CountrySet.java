package Praktikum_PBO_10.Task_2;

import java.util.HashSet;
import java.util.Set;

public class CountrySet {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        
        countries.add("Indonesia");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Japan"); 
        
        System.out.println("Jumlah negara: " + countries.size());
        System.out.println("Daftar negara: " + countries);
    }
}