import java.util.ArrayList;

public class KampusApp {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();    
        daftarMahasiswa.add(new Mahasiswa("241511090", "Siti Soviyyah", "Teknik Komputer dan Informatika"));

        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        daftarMataKuliah.add(new MataKuliah("21IF2014", "Aljabar Linear", 2));
        daftarMataKuliah.add(new MataKuliah("25IF2111", "Matematika Diskrit 2", 3));
        daftarMataKuliah.add(new MataKuliah("25IF2115", "Komputer Grafik", 4));
        daftarMataKuliah.add(new MataKuliah("25IF2114", "Basis Data", 4));
        daftarMataKuliah.add(new MataKuliah("25IF2112", "Pengantar Rekayasa Perangkat Lunak", 4));
        daftarMataKuliah.add(new MataKuliah("25IF2113", "Pemrograman Berorientasi Objek", 4));
        daftarMataKuliah.add(new MataKuliah("25IF2116", "Proyek 3 : Pengembangan Perangkat Lunak Berbasis Web", 3));
        
        System.out.println("===== SISTEM INFORMASI AKADEMIK SEDERHANA =====");
        System.out.println("\n--------- Menampilkan Data Mahasiswa ---------");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            daftarMahasiswa.get(i).displayInfo();
        }

        System.out.println("\n-------- Menampilkan Data Mata Kuliah -------");
        for (int i = 0; i < daftarMataKuliah.size(); i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            daftarMataKuliah.get(i).displayInfo();
        }
    }
}