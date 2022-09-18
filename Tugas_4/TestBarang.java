package Tugas_4;

public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "B001";
        b1.namaBarang = "Indomie";
        b1.hargaDasar = 40000;
        b1.diskon = (float) 0.1;

        b1.tampilData();
    }
}
