/**
 * Subclass Cylinder yang merupakan turunan dari Circle.
 */
public class Cylinder extends Circle {
    private double height; // variabel instance private

    // Constructors
    // 1. Constructor default
    public Cylinder() {
        super(); // Memanggil constructor default dari superclass (Circle)
        this.height = 1.0;
    }
    
    // 2. Constructor dengan parameter height
    public Cylinder(double height) {
        super(); // Memanggil constructor default dari superclass (Circle)
        this.height = height;
    }
    
    // 3. Constructor dengan parameter radius dan height
    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor Circle(radius)
        this.height = height;
    }

    // 4. Constructor dengan parameter radius, height, dan color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Memanggil constructor Circle(radius, color)
        this.height = height;
    }

    // Getter untuk height
    public double getHeight() {
        return this.height;
    }

    // Setter untuk height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method untuk menghitung volume
    public double getVolume() {
        // Menggunakan method getArea() yang diwarisi dari Circle
        return getArea() * height; // Luas alas * tinggi
    }
}