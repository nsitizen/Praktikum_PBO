public class TestCylinder {
    public static void main(String[] args) {
        // C1: Menggunakan constructor default
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());

        // C2: Menggunakan constructor dengan parameter height
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\nCylinder 2:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());

        // C3: Menggunakan constructor dengan parameter radius dan height
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\nCylinder 3:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume());
    }
}