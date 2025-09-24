package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    public static final String NAMA_KAMPUS = "Politeknik Negeri Bandung";

    // Attributes dibungkus (encapsulated) dengan keyword 'private'
    private String nim;
    private String nama;
    private String jurusan;
    private List<MataKuliah> daftarMataKuliah;

    // Constructor: Method khusus untuk membuat objek Mahasiswa baru
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.daftarMataKuliah = new ArrayList<>();
    }

    // Method untuk Agregasi: Menambahkan MataKuliah ke dalam daftar milik Mahasiswa
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        this.daftarMataKuliah.add(mataKuliah);
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
        System.out.println("Mata Kuliah yang Diambil:");
        
        if (daftarMataKuliah.isEmpty()) {
            System.out.println("  (Belum ada mata kuliah yang diambil)");
        } else {
            for (MataKuliah mk : daftarMataKuliah) {
                // Memanggil method toString() dari kelas MataKuliah
                System.out.println(mk); 
            }
        }
        System.out.println(); // Spasi
    }
}