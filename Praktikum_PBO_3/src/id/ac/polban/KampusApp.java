package id.ac.polban;

// Import kelas yang dibutuhkan
import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.MataKuliah;
import id.ac.polban.service.KampusService;

public class KampusApp {
    public static void main(String[] args) {
        // Mengakses variabel static langsung dari kelasnya
        System.out.println("===== SISTEM INFORMASI AKADEMIK " + Mahasiswa.NAMA_KAMPUS + " =====");

        // 1. DATA INPUTAN ASLI KAMU TETAP DIPERTAHANKAN
        // ===================================================
        Mahasiswa mhs1 = new Mahasiswa("241511090", "Siti Soviyyah", "Teknik Komputer dan Informatika");

        // Buat semua objek mata kuliah dari daftar aslimu
        MataKuliah aljabar = new MataKuliah("21IF2014", "Aljabar Linear", 2);
        MataKuliah matdis = new MataKuliah("25IF2111", "Matematika Diskrit 2", 3);
        MataKuliah grafkom = new MataKuliah("25IF2115", "Komputer Grafik", 4);
        MataKuliah basisData = new MataKuliah("25IF2114", "Basis Data", 4);
        MataKuliah rpl = new MataKuliah("25IF2112", "Pengantar Rekayasa Perangkat Lunak", 4);
        MataKuliah pbo = new MataKuliah("25IF2113", "Pemrograman Berorientasi Objek", 4);
        MataKuliah proyek3 = new MataKuliah("25IF2116", "Proyek 3 : Pengembangan Perangkat Lunak Berbasis Web", 3);
        // ===================================================

        // 2. Membuat objek service untuk menjalankan logika bisnis
        KampusService service = new KampusService();

        // 3. Menggunakan service untuk mendaftarkan BEBERAPA mata kuliah ke Mahasiswa SITI
        //    (Ini adalah bagian yang menunjukkan relasi DEPENDENCY)
        System.out.println("\n--------- Proses Pendaftaran Mata Kuliah untuk " + mhs1.getNama() + " ---------");
        service.daftarkanMataKuliahUntukMahasiswa(mhs1, pbo);
        service.daftarkanMataKuliahUntukMahasiswa(mhs1, basisData);
        service.daftarkanMataKuliahUntukMahasiswa(mhs1, grafkom);
        service.daftarkanMataKuliahUntukMahasiswa(mhs1, proyek3);

        // 4. Menampilkan hasil akhir
        //    (Outputnya akan menunjukkan bahwa Siti Soviyyah kini "memiliki" 4 mata kuliah,
        //     ini membuktikan relasi AGREGASI)
        System.out.println("\n--------- Menampilkan Data Akhir Mahasiswa ---------");
        mhs1.displayInfo();
    }
}