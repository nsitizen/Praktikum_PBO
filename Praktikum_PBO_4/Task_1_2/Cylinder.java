public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super();
        this.height = 1.0;
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return this.height;
    }
    
    /**
     * [cite_start]TUGAS 1.2: Override method getArea() untuk menghitung luas permukaan silinder. [cite: 129]
     * Rumus: (2 * PI * r * h) + (2 * Luas Alas).
     */
    @Override
    public double getArea() {
        // [cite_start] super.getArea() memanggil getArea() dari Circle (luas alas) [cite: 135]
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    /**
     * [cite_start]TUGAS 1.2: Perbaiki method getVolume() agar menggunakan luas alas, bukan luas permukaan. [cite: 134]
     */
    public double getVolume() {
        return super.getArea() * height;
    }
}