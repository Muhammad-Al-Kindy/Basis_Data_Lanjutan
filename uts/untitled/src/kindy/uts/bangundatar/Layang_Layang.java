package kindy.uts.bangundatar;

public class Layang_Layang extends BangunDatar{
    float diagonal1, diagonal2;
    int sisia,sisic;

    Layang_Layang(float diagonal1, float diagonal2,int sisia,int sisic){
        super();
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisia = sisia;
        this.sisic=sisic;
    }
    void setLuas(){
        super.luas = diagonal1 * diagonal2;
    }
    void setKeliling(){
        super.keliling = 2*(sisic+sisia);
    }
    void tampilLayang(){
        super.tampilData();
        System.out.println("Diagonal pertama ="+diagonal1);
        System.out.println("Diagonal kedua ="+diagonal2);
        System.out.println("Sisi a"+sisia);
        System.out.println("Sisi c"+sisic);
    }

}
