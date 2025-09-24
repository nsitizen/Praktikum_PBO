public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3.0, 7.0);

        System.out.println("--- Menguji Fungsionalitas Tugas 1.3 ---");
        
        // Mencetak objek c1 akan otomatis memanggil method toString() yang baru
        System.out.println(c1);

        // Membuktikan bahwa getArea() masih menghitung luas alas
        System.out.println("Base Area: " + c1.getArea());
        System.out.println("Volume: " + c1.getVolume());
    }
}