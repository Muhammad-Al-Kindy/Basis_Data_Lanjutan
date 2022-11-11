package Tugas.Overriding.Stereotype;

public class CobaOverriding {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        Manusia mahasiswa1 = new Mahasiswa();
        Manusia dosen1 = new Dosen();

        manusia1.bernafas();
        manusia1.makan();

        mahasiswa1.makan();

        dosen1.makan();
    }
}
