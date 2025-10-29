package Praktikum_PBO_10.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class SchoolDemo {

    public static void main(String[] args) {
        
        // --- Bagian ArrayList (Sort by Name) ---
        System.out.println("--- ArrayList (Sort by Name) ---");
        
        ArrayList<Student<?>> studentList = new ArrayList<>();
        
        // Membuat 5 student objects (campuran String dan Integer dept)
        studentList.add(new Student<>("S001", "Charlie", "123 Oak St", "Physics"));
        studentList.add(new Student<>("S002", "Alice", "456 Pine St", 102)); // Dept ID
        studentList.add(new Student<>("S003", "Eve", "789 Maple St", "Biology"));
        studentList.add(new Student<>("S004", "Bob", "321 Birch St", 101)); // Dept ID
        studentList.add(new Student<>("S005", "David", "654 Cedar St", "Chemistry"));
        
        System.out.println("Before Sorting:");
        for (Student<?> s : studentList) {
            System.out.println(s);
        }
        
        Collections.sort(studentList);
        
        System.out.println("\nAfter Sorting by Name:");
        for (Student<?> s : studentList) {
            System.out.println(s);
        }

        System.out.println("\n-------------------------------------");

        // --- Bagian Vector (Filter by Dept) ---
        System.out.println("--- Vector (Filter by Dept 'Computer Science') ---");

        Vector<Student<String>> studentVector = new Vector<>();
        
        // Membuat 5 student objects baru
        studentVector.add(new Student<>("V001", "Grace", "111 Elm St", "Computer Science"));
        studentVector.add(new Student<>("V002", "Heidi", "222 Spruce St", "Mathematics"));
        studentVector.add(new Student<>("V003", "Ivan", "333 Willow St", "Computer Science"));
        studentVector.add(new Student<>("V004", "Judy", "444 Palm St", "Physics"));
        studentVector.add(new Student<>("V005", "Mallory", "555 Poplar St", "Computer Science"));
        
        System.out.println("Students in 'Computer Science':");
        
        for (Student<String> s : studentVector) {
            if (s.getDepartment().equals("Computer Science")) {
                System.out.println(s);
            }
        }
    }
}