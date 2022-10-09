package kindy.relasiclass.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    Kursi(String nomor){
        this.nomor =nomor;
    }
    void setNomor(String nomor){
        this.nomor = nomor;
    }
    String getNomor(){
        return nomor;
    }
    void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    Penumpang getPenumpang(){
        return penumpang;
    }
    String info(){
        String info = "";
        info += "Nomor: "+nomor+"\n";
        if (this.penumpang !=null){
            info += "Penumpang: "+penumpang.info()+"\n";
        }
        return info;
    }
}
