// INHERITANCE: Mahasiswa 'extends' (adalah sebuah) EntitasAkademik
public class Mahasiswa extends EntitasAkademik {
    // Atribut spesifik untuk Mahasiswa
    private String jurusan;

    // Constructor Mahasiswa
    public Mahasiswa(String nim, String nama, String jurusan) {
        // SUPER: Memanggil constructor dari class induk (EntitasAkademik)
        // untuk mengisi atribut 'kode' dan 'nama'.
        super(nim, nama);
        this.jurusan = jurusan;
    }
 
    // OVERRIDE: Menimpa method displayInfo() dari induknya
    @Override
    public void displayInfo() {
        System.out.println("--- Data Mahasiswa ---");
        // SUPER: Memanggil method displayInfo() milik induk untuk menampilkan data umum
        super.displayInfo(); 
        // Menambahkan info spesifik milik Mahasiswa
        System.out.println("Jurusan  : " + this.jurusan);
        System.out.println(); // Memberi jarak baris
    }
}