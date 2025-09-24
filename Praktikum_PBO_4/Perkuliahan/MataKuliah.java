// INHERITANCE: MataKuliah 'extends' (adalah sebuah) EntitasAkademik
public class MataKuliah extends EntitasAkademik {
    // Atribut spesifik untuk MataKuliah
    private int sks;

    // Constructor MataKuliah
    public MataKuliah(String kodeMK, String namaMK, int sks) {
        // SUPER: Memanggil constructor dari class induk (EntitasAkademik)
        super(kodeMK, namaMK);
        this.sks = sks;
    }

    // OVERRIDE: Menimpa method displayInfo() dari induknya
    @Override
    public void displayInfo() {
        System.out.println("--- Data Mata Kuliah ---");
        // SUPER: Memanggil method displayInfo() milik induk untuk menampilkan data umum
        super.displayInfo();
        // Menambahkan info spesifik milik MataKuliah
        System.out.println("SKS      : " + this.sks);
        System.out.println(); // Memberi jarak baris
    }
}