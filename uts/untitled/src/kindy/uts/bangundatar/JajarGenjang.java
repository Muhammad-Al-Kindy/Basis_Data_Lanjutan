package kindy.uts.bangundatar;

public class JajarGenjang extends BangunDatar{
    int alas, tinggi;
    int sisiA,sisiB,sisiC,sisiD;

    JajarGenjang(int alas, int tinggi,int sisiA,int sisiB, int sisiC, int sisiD){
        super();
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
    }
    void setKeliling(){
        super.keliling = sisiA+sisiB+sisiC+sisiD;
    }
    void setLuas(){
        super.luas = alas * tinggi;
    }
    void tampilJajarGenjang(){
        super.tampilData();
        System.out.println("Alas ="+alas);
        System.out.println("Tinggi ="+tinggi);
        System.out.println("Sisi A ="+sisiA);
        System.out.println("Sisi B ="+sisiB);
        System.out.println("Sisi C ="+sisiC);
        System.out.println("Sisi D ="+sisiD);
    }
}
