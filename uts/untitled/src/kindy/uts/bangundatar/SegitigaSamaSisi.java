package kindy.uts.bangundatar;

public class SegitigaSamaSisi extends BangunDatar{
    int alas,tinggi;

    SegitigaSamaSisi(int alas, int tinggi){
        this.alas = alas;
        this.tinggi =tinggi;
    }
    void setLuas(){
        super.luas = (alas*tinggi)/2;
    }
    void setKeliling(){
        float setengahAlas = (float) (0.5 *alas);
        double pertambahanATambahB = (tinggi*tinggi) + (setengahAlas*setengahAlas);
        float sisib = (float) Math.sqrt(pertambahanATambahB);
        super.keliling = alas+sisib;
    }
    void tampilSegitigaSamaSisi(){
        super.tampilData();
        System.out.println("Alas ="+alas);
        System.out.println("Tinggi ="+tinggi);
    }
}
