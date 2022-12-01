package Kuis2;

public class AnakPemburu extends Pemburu implements IMengambilTelur{
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Anak pemburu mengambil telur dino");
    }
}
