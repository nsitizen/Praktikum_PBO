package Praktikum_PBO_6.Studi_Kasus3;

//******************************************************************
//  Strings.java
//
//  Demonstrates sorting on an array of strings.
//******************************************************************
import java.util.Scanner;

public class Strings {
    //-----------------------------------------------------------------
    //  Reads in an array of strings, sorts them,
    //  then prints them in sorted order.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next(); // Membaca string satu per satu
        }

        // Memanggil insertionSort untuk urutan menurun
        Sorting.insertionSort(stringList);

        System.out.println("\nYour strings in sorted order (descending)...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + " ");
        }
        System.out.println();
    }
}