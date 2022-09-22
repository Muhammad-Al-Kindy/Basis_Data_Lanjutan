package tugas4sampai6;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444","Donny",5000000);

        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjam: "+donny.getLimitPinjam());

        System.out.print("\nMasukkan Jumlah Pinjam : ");
        int pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjam saat ini: "+donny.getJumlahPinjam());

        while (donny.getJumlahPinjam() != 0){
                System.out.print("\nMasukkan Angsuran sekarang : ");
                int angsuran = sc.nextInt();
                donny.angsur(angsuran);
                System.out.println("Jumlah pinjam saat ini: "+donny.getJumlahPinjam());
        }
    }
}
