// Import kelas dari JAR kita
import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.MataKuliah;
import id.ac.polban.service.KampusService;

public class PenggunaApp {
    public static void main(String[] args) {
        System.out.println("+++ Menjalankan aplikasi baru yang menggunakan KampusApp.jar +++");
        System.out.println("Library ini untuk kampus: " + Mahasiswa.NAMA_KAMPUS);
        Mahasiswa mhsBaru = new Mahasiswa("231511099", "Citra Dewi", "Teknik Komputer dan Informatika");
        MataKuliah algo = new MataKuliah("IF200", "Algoritma Lanjut", 3);
        
        KampusService service = new KampusService();
        service.daftarkanMataKuliahUntukMahasiswa(mhsBaru, algo);

        System.out.println("\n--- Data Mahasiswa Baru ---");
        
        mhsBaru.displayInfo();
    }
}