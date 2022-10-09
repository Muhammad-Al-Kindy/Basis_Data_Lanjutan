package kindy.relasiclass.tugas;

public class Kelas {
    private String kelas;
    private String namaKelas;

    Kelas(String namaKelas, String kelas){
        this.namaKelas = namaKelas;
        this.kelas = kelas;
    }
    void setKelas(String kelas){
        this.kelas = kelas;
    }
    String getKelas(){
        return kelas;
    }
    void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }
    String getNamaKelas(){
        return namaKelas;
    }
    String info(){
        String info = "";
        info +="Kelas: "+kelas+"\n";
        info +="Nama Kelas: "+namaKelas+"\n";
        return info;
    }
}
