package Praktikum_PBO_6.Studi_Kasus2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + this.length + " and width " + this.width;
    }
}