package Pegawai;

import java.util.Scanner;

public class TestPegawai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pegawai : ");
        int jumlah = sc.nextInt();
        for (int i = 0; i<jumlah;i++){
            System.out.print("Masukkan Nama Pegawai : ");
            sc.nextLine();
            String Nama = sc.nextLine();
            System.out.print("Masukkan NIP Pegawai : ");
            String NIP = sc.nextLine();
            System.out.print("Masukkan Jam Kerja : ");
            int jamKerja = sc.nextInt();
            Pegawai p1 = new Pegawai(Nama,NIP,jamKerja);
            p1.setGajiPokok();
            p1.setLembur();
            p1.setTransport();
            p1.setUangMakan();
            p1.hitungGajiHarian();
            p1.cetakPenghasilan();
            System.out.println();
        }
    }
}
