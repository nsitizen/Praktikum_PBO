public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2.0, 5.0);

        System.out.println("--- Menguji Fungsionalitas Tugas 1.2 ---");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getHeight());
        
        // Memanggil getArea() yang sudah di-override (menghasilkan luas permukaan)
        System.out.println("Surface Area: " + c1.getArea());
        
        // Memanggil getVolume() yang sudah diperbaiki
        System.out.println("Volume: " + c1.getVolume());
    }
}