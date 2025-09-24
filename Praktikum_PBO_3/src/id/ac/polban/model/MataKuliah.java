package id.ac.polban.model;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // --- GETTERS ---
    public String getKodeMK() {
        return this.kodeMK;
    }

    public String getNamaMK() {
        return this.namaMK;
    }

    public int getSks() {
        return this.sks;
    }

    // Menggunakan toString() untuk representasi string yang lebih baik
    @Override
    public String toString() {
        return "  - " + this.kodeMK + " | " + this.namaMK + " (" + this.sks + " SKS)";
    }
}