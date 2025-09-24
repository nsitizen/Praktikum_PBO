package id.ac.polban.service;

import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.MataKuliah;

public class KampusService {
    
    /**
     * Penerapan Dependensi: Method ini "menggunakan" objek Mahasiswa dan MataKuliah
     * untuk melakukan suatu pekerjaan, tanpa harus menyimpannya sebagai field.
     * Relasi "uses-a".
     */
    public void daftarkanMataKuliahUntukMahasiswa(Mahasiswa mahasiswa, MataKuliah mataKuliah) {
        // Logika untuk mendaftarkan
        mahasiswa.tambahMataKuliah(mataKuliah);
        
        // Memberi feedback
        System.out.println("[INFO] " + mahasiswa.getNama() + " berhasil mengambil mata kuliah " + mataKuliah.getNamaMK());
    }
}