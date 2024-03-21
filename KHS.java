package PemLan;

import java.util.ArrayList;

public class KHS {

    // Mmebuat atribut
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> daftarMataKuliah;

    // Membuat constructor
    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarMataKuliah = new ArrayList<>();
    }

    // Membuat method
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // Membuat method untuk menampilkan output
    public void cetakKHS() {
        System.out.println("===========================================================");
        System.out.println("                      Kartu Hasil Studi                    ");
        System.out.println("===========================================================");
        System.out.println("NIM  : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Mata Kuliah\tKode MK\t\tNilai\t\tNilai Huruf");
        System.out.println("-----------------------------------------------------------");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println(mk.getNamaMK() + "\t" + " MK" + mk.getKodeMK() + "\t\t " +
                    mk.getNilaiAngka() + "\t\t    " + mk.getNilaiHuruf());
        }
        System.out.println("===========================================================");
    }
}

