package PemLan;

public class MataKuliah {

    // Membuat atribut
    private String kodeMK;
    private String namaMK;
    private int nilaiAngka;

    // Membuat constructor
    public MataKuliah(String kodeMK, String namaMK, int nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    // Membuat getter
    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka >= 60 && nilaiAngka < 80) {
            return "B";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "C";
        } else if (nilaiAngka >= 40 && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
