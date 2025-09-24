// INHERITANCE: Ini adalah class induk (superclass)
public class EntitasAkademik {
    // Atribut yang akan diwariskan, 'protected' agar bisa diakses oleh class anak
    protected String kode;
    protected String nama;

    // Constructor untuk class induk
    public EntitasAkademik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    // Method dasar yang akan di-override oleh class anak
    public void displayInfo() {
        System.out.println("Kode/NIM : " + this.kode);
        System.out.println("Nama     : " + this.nama);
    }
}