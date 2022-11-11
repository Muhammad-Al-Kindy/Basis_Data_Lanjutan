package Tugas.Overloading;

public class CobaOverloading {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Total sudut segitiga "+segitiga1.totalSudut(40));
        System.out.println("Total sudut segitiga "+segitiga1.totalSudut(40,50));

        System.out.println("Keliling segitiga "+segitiga1.keliling(3,4));
        System.out.println("Keliling segitiga "+segitiga1.keliling(3,4,5));
    }
}
