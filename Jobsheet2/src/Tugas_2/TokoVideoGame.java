package Tugas_2;

public class TokoVideoGame {
    public String idPeminjaman, namaMember, namaGame;

    public int hargaSewa, lamaSewa;

    public int hitungHargaSewa(int lamaSewa, int hargaSewa){
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        return hargaSewa * lamaSewa;
    }
    public void cetakTransaksi(){
        System.out.println("Id Peminjam        : "+idPeminjaman);
        System.out.println("Nama Member        : "+namaMember);
        System.out.println("Nama Game          : "+namaGame);
        System.out.println("Harga Sewa Sehari  : "+hargaSewa);
        System.out.println("Lamaa Sewa         : "+lamaSewa);
        System.out.println("Harga Total Sewa   : "+hitungHargaSewa(lamaSewa,hargaSewa));
    }
}
