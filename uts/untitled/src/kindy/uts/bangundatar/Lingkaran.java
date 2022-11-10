package kindy.uts.bangundatar;

public class Lingkaran extends BangunDatar{
    float phi;
    int jari_jari;

    Lingkaran(float phi,int jari_jari){
        this.phi = phi;
        this.jari_jari = jari_jari;
    }
    void setKeliling() {
        super.keliling = 2 * phi * jari_jari;
    }
    void setLuas(){
        super.luas = phi*jari_jari*jari_jari;
    }
    void tampilLingkaran(){
        super.tampilData();
        System.out.println("Jari-jari ="+jari_jari);
        System.out.println("Phi ="+phi);
    }
}
