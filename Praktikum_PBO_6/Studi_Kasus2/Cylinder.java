package Praktikum_PBO_6.Studi_Kasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + this.radius + " and height " + this.height;
    }
}