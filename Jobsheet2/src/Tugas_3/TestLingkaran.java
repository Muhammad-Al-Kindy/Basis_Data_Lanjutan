package Tugas_3;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;
        lingkaran.phi=3.14;

        System.out.printf("Luas lingkaran dengan jari %s adalah %s",lingkaran.r,lingkaran.hitungLuas());
        System.out.printf("\nKeliling lingkaran dengan jari %s adalah %s",lingkaran.r,lingkaran.hitungKeliling());

    }
}
