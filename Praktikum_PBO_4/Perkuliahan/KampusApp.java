import java.util.ArrayList;

public class KampusApp {
    public static void main(String[] args) {
        // Berkat inheritance, kita bisa menyimpan Mahasiswa dan MataKuliah
        // dalam satu list yang sama (polimorfisme).
        ArrayList<EntitasAkademik> daftarEntitas = new ArrayList<>();
        
        // Menambahkan objek Mahasiswa dan MataKuliah ke dalam satu list
        daftarEntitas.add(new Mahasiswa("241511090", "Siti Soviyyah", "Teknik Komputer dan Informatika"));
        daftarEntitas.add(new MataKuliah("21IF2014", "Aljabar Linear", 2));
        daftarEntitas.add(new MataKuliah("25IF2111", "Matematika Diskrit 2", 3));
        daftarEntitas.add(new MataKuliah("25IF2115", "Komputer Grafik", 4));
        daftarEntitas.add(new MataKuliah("25IF2114", "Basis Data", 4));
        daftarEntitas.add(new MataKuliah("25IF2112", "Pengantar Rekayasa Perangkat Lunak", 4));
        daftarEntitas.add(new MataKuliah("25IF2113", "Pemrograman Berorientasi Objek", 4));
        daftarEntitas.add(new MataKuliah("25IF2116", "Proyek 3 : Pengembangan Perangkat Lunak Berbasis Web", 3));

        System.out.println("===== SISTEM INFORMASI AKADEMIK (Versi Inheritance) =====");
        System.out.println();

        // Satu loop untuk menampilkan semua jenis entitas
        for (EntitasAkademik entitas : daftarEntitas) {
            // Java akan secara otomatis memanggil method displayInfo() yang sesuai
            // (versi Mahasiswa atau versi MataKuliah) berkat @Override.
            entitas.displayInfo();
        }
    }
}