package kindy.relasiclass.percobaan2;

public class Mobil {
    private String nama;
    private int biaya;

    Mobil(){

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
    int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
