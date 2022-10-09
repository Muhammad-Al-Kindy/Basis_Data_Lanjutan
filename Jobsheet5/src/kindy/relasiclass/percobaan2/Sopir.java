package kindy.relasiclass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    Sopir(){

    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setBiaya(int biaya){
        this.biaya = biaya;
    }
    int getBiaya(){
        return biaya;
    }
    int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
