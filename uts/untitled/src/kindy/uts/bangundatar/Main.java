package kindy.uts.bangundatar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi, alas, sisiA, sisiB, sisiC, sisiD, jari, panjang, lebar, sisi;
        float diagonal1, diagonal2;
        char pilih;
        int pilihan;
        do {
            System.out.println("-----------------------");
            System.out.println("Perhitungan Bangun Datar");
            System.out.println("-----------------------");
            System.out.println();
            System.out.println("1. Jajargenjang");
            System.out.println("2. Layang-layang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Persegi");
            System.out.println("5. Persegi Panjang");
            System.out.println("6. Segitiga Sama Sisi");
            System.out.print("Mau menghitung bangun apa ???");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tinggi :");
                    tinggi = sc.nextInt();
                    System.out.print("Masukkan alas :");
                    alas = sc.nextInt();
                    System.out.print("Masukkan sisi A :");
                    sisiA = sc.nextInt();
                    System.out.print("Masukkan sisi B :");
                    sisiB = sc.nextInt();
                    System.out.print("Masukkan sisi C :");
                    sisiC = sc.nextInt();
                    System.out.print("Masukkan sisi D :");
                    sisiD = sc.nextInt();
                    JajarGenjang jjg = new JajarGenjang(alas, tinggi, sisiA, sisiB, sisiC, sisiD);
                    jjg.setKeliling();
                    jjg.setLuas();
                    jjg.tampilJajarGenjang();
                    break;
                case 2:
                    System.out.print("Masukkan diagonal1 :");
                    diagonal1 = sc.nextFloat();
                    System.out.print("Masukkan diagonal2 :");
                    diagonal2 = sc.nextFloat();
                    System.out.print("Masukkan sisi A :");
                    sisiA = sc.nextInt();
                    System.out.print("Masukkan sisi C :");
                    sisiC = sc.nextInt();
                    Layang_Layang layang = new Layang_Layang(diagonal1, diagonal2, sisiA, sisiC);
                    layang.setKeliling();
                    layang.setLuas();
                    layang.tampilLayang();
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari :");
                    jari = sc.nextInt();
                    Lingkaran l1 = new Lingkaran((float) 3.14, jari);
                    l1.setKeliling();
                    l1.setLuas();
                    l1.tampilLingkaran();
                    break;
                case 4:
                    System.out.print("Masukkan Sisi :");
                    sisi = sc.nextInt();
                    Persegi persegi = new Persegi(sisi);
                    persegi.setKeliling();
                    persegi.setLuas();
                    persegi.tampilPersegi();
                    break;
                case 5:
                    System.out.print("Masukkan panjang :");
                    panjang = sc.nextInt();
                    System.out.print("Masukkan lebar :");
                    lebar = sc.nextInt();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(lebar, panjang);
                    persegiPanjang.setKeliling();
                    persegiPanjang.setLuas();
                    persegiPanjang.tampilPersegiPanjang();
                    break;
                case 6:
                    System.out.print("Masukkan alas :");
                    alas = sc.nextInt();
                    System.out.print("Masukkan tinggi :");
                    tinggi = sc.nextInt();
                    SegitigaSamaSisi s1 = new SegitigaSamaSisi(alas, tinggi);
                    s1.setKeliling();
                    s1.setLuas();
                    s1.tampilSegitigaSamaSisi();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
            System.out.print("Ingin melanjutkan menghitung (y/n) ?");
            pilih = sc.next().charAt(0);
        } while (pilih == 'y'|| pilih =='Y');
    }
}
