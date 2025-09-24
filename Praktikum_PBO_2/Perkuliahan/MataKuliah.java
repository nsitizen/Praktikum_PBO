public class MataKuliah {
    // Attributes dibungkus dengan 'private'
    private String kodeMK;
    private String namaMK;
    private int sks;

    // Constructor untuk membuat objek MataKuliah baru
    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // --- METHODS ---

    // Getter untuk mendapatkan kode mata kuliah
    public String getKodeMK() {
        return this.kodeMK;
    }

    // Getter untuk mendapatkan nama mata kuliah
    public String getNamaMK() {
        return this.namaMK;
    }

    // Getter untuk mendapatkan SKS
    public int getSks() {
        return this.sks;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void displayInfo() {
        System.out.println("Kode MK  : " + this.kodeMK);
        System.out.println("Nama MK  : " + this.namaMK);
        System.out.println("SKS      : " + this.sks);
        System.out.println(); // Memberi jarak baris
    }
}