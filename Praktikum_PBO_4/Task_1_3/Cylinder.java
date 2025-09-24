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
    
    // getVolume() menggunakan getArea() dari superclass secara implisit
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * [cite_start]TUGAS 1.3: Override method toString() untuk memberikan deskripsi yang lebih baik. [cite: 137]
     * [cite_start]Method ini memanfaatkan toString() dari superclass. [cite: 141]
     */
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}