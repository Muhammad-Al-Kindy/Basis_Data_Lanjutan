package sepatudemo;
public class SepatuDemo {
    public static void main(String[] args) {
        Sepatu sepatu = new Sepatu();
        SepatuBola sepatuBola = new SepatuBola();

        sepatu.setMerek("Adidas");
        sepatu.setWarna("White");
        sepatu.setUkuran(40);
        sepatu.cetakStatus();
        System.out.println();

        sepatuBola.setMerek("Puma");
        sepatuBola.setWarna("Green & Black");
        sepatuBola.setUkuran(42);
        sepatuBola.setPul(6);
        sepatuBola.cetakStatus();
    }
}
