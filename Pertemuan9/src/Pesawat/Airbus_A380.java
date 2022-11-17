package Pesawat;

public class Airbus_A380 extends Pesawat{
    @Override
    public void memilikiMesin() {
        System.out.println("4 x Engine Aliance GP7200 turbofan");
    }

    @Override
    public double panjangSayap() {
        panjang = 79.8;
        return panjang;
    }
    public int kecepatan(){
        return 1020;
    }
}
