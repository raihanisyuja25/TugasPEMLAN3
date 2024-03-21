package PemLan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user untuk input data mahasiswa berupa nim dan nama
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("NIM Mahasiswa  : ");
        String nim = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.println();

        // Membuat objek 
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);
        KHS khs = new KHS(mahasiswa);

        // Meminta user untuk input mata kuliah pilihan mahasiswa
        boolean tambahMataKuliah = true;
        while (tambahMataKuliah) {
            System.out.println("\nMasukkan Mata Kuliah Pilihan");
            System.out.print("Kode MK : MK");
            String kodeMK = input.nextLine();

            if (kodeMK.equals("0")) { // User dapat mengetik 0 untuk selesai
                tambahMataKuliah = false; 
            } else {
                System.out.print("Nama MK : ");
                String namaMK = input.nextLine();

                System.out.print("Nilai   : ");
                int nilaiAngka = input.nextInt();
                input.nextLine(); 

                MataKuliah mataKuliah = new MataKuliah(kodeMK, namaMK, nilaiAngka);
                khs.tambahMataKuliah(mataKuliah);
            }
        }

        khs.cetakKHS(); // Menampilkan output dari method di class KHS

        input.close();
    }
}
