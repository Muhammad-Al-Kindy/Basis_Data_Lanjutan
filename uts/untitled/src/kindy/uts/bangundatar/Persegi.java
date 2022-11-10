package kindy.uts.bangundatar;

public class Persegi extends BangunDatar{
    int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
    }
    void setKeliling(){
        super.keliling = 4*sisi;
    }
    void setLuas(){
        super.luas = sisi*sisi;
    }
    void tampilPersegi(){
        super.tampilData();
        System.out.println("Sisi ="+sisi);
    }
}
