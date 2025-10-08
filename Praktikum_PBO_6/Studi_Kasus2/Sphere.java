package Praktikum_PBO_6.Studi_Kasus2;

//************************************************************
//  Sphere.java
//
//  Represents a sphere.
//************************************************************
public class Sphere extends Shape {
    private double radius; //radius in feet

    //--------------------------------------------------
    //  Constructor: Sets up the sphere.
    //--------------------------------------------------
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    //--------------------------------------------------
    //  Returns the surface area of the sphere.
    //--------------------------------------------------
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    //--------------------------------------------------
    //  Returns the sphere as a String.
    //--------------------------------------------------
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}