package kindy.relasiclass.percobaan3;

public class Pegawai {
    private String nip, nama;

    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    void setNip(String nip){
        this.nip =nip;
    }
    String getNip(){
        return nip;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    String info(){
        String info = "";
        info +="Nip: "+this.nip+"\n";
        info += "Nama: "+this.nama+"\n";
        return info;
    }
}
