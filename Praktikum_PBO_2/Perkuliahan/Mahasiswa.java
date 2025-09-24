public class Mahasiswa {
    // Attributes dibungkus (encapsulated) dengan keyword 'private'
    private String nim;
    private String nama;
    private String jurusan;

    // Constructor: Method khusus untuk membuat objek Mahasiswa baru
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // --- METHODS ---

    // Getter untuk mendapatkan NIM (akses read-only)
    public String getNim() {
        return this.nim;
    }

    // Getter untuk mendapatkan Nama
    public String getNama() {
        return this.nama;
    }

    // Getter untuk mendapatkan Jurusan
    public String getJurusan() {
        return this.jurusan;
    }
    
    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM      : " + this.nim);
        System.out.println("Nama     : " + this.nama);
        System.out.println("Jurusan  : " + this.jurusan);
        System.out.println(); // Memberi jarak baris
    }
}