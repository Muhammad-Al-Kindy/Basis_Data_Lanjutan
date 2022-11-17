package Pesawat;

public class TestPesawat {
    public static void main(String[] args) {
        Boeing747 boeing747 = new Boeing747();
        Airbus_A380 airbus_a380 = new Airbus_A380();
        Sukhoi_Su35 sukhoi_su35 = new Sukhoi_Su35();

        System.out.println("Boeing 747");
        boeing747.memilikiMesin();
        System.out.println("Memiliki panjang sayap "+boeing747.panjangSayap()+" m");
        System.out.println("Memiliki kecepatan "+boeing747.kecepatan()+ " km/jam");
        System.out.println();
        System.out.println("Airbus A380");
        airbus_a380.memilikiMesin();
        System.out.println("Memiliki panjang sayap "+airbus_a380.panjangSayap()+" m");
        System.out.println("Memiliki kecepatan "+airbus_a380.kecepatan()+ " km/jam");
        System.out.println();
        System.out.println("Sukhoi Su35");
        sukhoi_su35.memilikiMesin();
        System.out.println("Memiliki panjang sayap "+sukhoi_su35.panjangSayap()+" m");
        System.out.println("Memiliki kecepatan "+sukhoi_su35.kecepatan()+ " km/jam");
    }
}
