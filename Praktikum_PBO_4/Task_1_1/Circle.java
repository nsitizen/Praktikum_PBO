/**
 * Superclass Circle, model lingkaran dengan radius dan warna.
 */
public class Circle {
    // Variabel instance private
    private double radius;
    private String color;

    // Constructors (overloaded)
    // 1. Constructor default
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // 2. Constructor dengan parameter radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    
    // 3. Constructor dengan parameter radius dan color [Tugas 1.1]
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter untuk radius
    public double getRadius() {
        return this.radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter untuk color [Tugas 1.1]
    public String getColor() {
        return this.color;
    }
    
    // Setter untuk color [Tugas 1.1]
    public void setColor(String color) {
        this.color = color;
    }

    // Method untuk menghitung luas
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Method toString untuk deskripsi objek
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}