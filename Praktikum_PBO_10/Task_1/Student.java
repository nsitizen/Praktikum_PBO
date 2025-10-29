package Praktikum_PBO_10.Task_1;

import java.lang.Comparable;

public class Student<T> implements Comparable<Student<T>> {

    private String studentID;
    private String name;
    private String address;
    private T department; 

    public Student(String studentID, String name, String address, T department) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public T getDepartment() {
        return department;
    }

    public void setDepartment(T department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentID + ", Name=" + name + 
               ", Dept=" + department + ", Address=" + address + "]";
    }

    @Override
    public int compareTo(Student<T> other) {
        return this.name.compareTo(other.getName());
    }
}