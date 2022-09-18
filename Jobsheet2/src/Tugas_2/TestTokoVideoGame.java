package Tugas_2;

public class TestTokoVideoGame {
    public static void main(String[] args) {
        TokoVideoGame peminjam = new TokoVideoGame();
        peminjam.idPeminjaman = "A01";
        peminjam.namaMember = "Kindy";
        peminjam.namaGame = "Pes 2017";
        peminjam.hargaSewa = 20000;
        peminjam.lamaSewa = 5;

        peminjam.cetakTransaksi();
    }
}
