package kindy.uts.bangundatar;

public class PersegiPanjang extends BangunDatar{
    int lebar, panjang;

    PersegiPanjang(int lebar,int panjang){
        super();
        this.lebar = lebar;
        this.panjang = panjang;
    }
    void setLuas(){
        super.luas = lebar*panjang;
    }
    void setKeliling(){
        super.keliling = 2*(lebar+panjang);
    }
    void tampilPersegiPanjang(){
        super.tampilData();
        System.out.println("Lebar ="+lebar);
        System.out.println("Panjang ="+panjang);
    }
}
