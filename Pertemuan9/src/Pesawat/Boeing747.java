package Pesawat;

public class Boeing747 extends Pesawat {
    @Override
    public void memilikiMesin() {
        System.out.println("4 x General electric GE NX 2B76 turbofan");
    }

    @Override
    public double panjangSayap() {
        panjang = 59.6;
        return panjang;
    }
    public int kecepatan(){
        return 955;
    }
}
