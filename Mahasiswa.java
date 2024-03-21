package PemLan;

public class Mahasiswa {

    // Membuat atribut
    private String nim;
    private String nama;

    // Membuat constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Membuat getter 
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}