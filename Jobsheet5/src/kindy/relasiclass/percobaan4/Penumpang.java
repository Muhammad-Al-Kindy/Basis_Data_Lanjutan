package kindy.relasiclass.percobaan4;

public class Penumpang {
    private String nama,ktp;

    Penumpang(String ktp, String nama){
        this.nama = nama;
        this.ktp = ktp;
    }
    void setKtp(String ktp){
        this.ktp = ktp;
    }
    String getKtp(){
        return ktp;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    String info(){
        String info ="";
        info += "Ktp: "+ktp+"\n";
        info += "Nama: "+nama+"\n";
        return info;
    }
}
