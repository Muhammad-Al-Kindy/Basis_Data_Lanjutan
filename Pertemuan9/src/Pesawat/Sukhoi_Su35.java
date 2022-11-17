package Pesawat;

public class Sukhoi_Su35 extends Pesawat{
    @Override
    public void memilikiMesin() {
        System.out.println("2x Saturn AL-41F1S after burning turbofan");
    }

    @Override
    public double panjangSayap() {
        panjang = 15.3;
        return panjang;
    }
    public int kecepatan(){
        return 2400;
    }
}
