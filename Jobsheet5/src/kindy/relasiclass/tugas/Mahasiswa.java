package kindy.relasiclass.tugas;

public class Mahasiswa {
    private String nis,namaSiswa,alamatSiswa,kelamin;
    private Kelas kelas;

    Mahasiswa(String nis, String namaSiswa, String alamatSiswa, String kelamin, Kelas kelas){
        this.nis = nis;
        this.namaSiswa = namaSiswa;
        this.alamatSiswa = alamatSiswa;
        this.kelamin = kelamin;
        this.kelas = kelas;
    }
    void setNis(String nis){
        this.nis = nis;
    }
    String getNis(){
        return nis;
    }
    void setNamaSiswa(String namaSiswa){
        this.namaSiswa = namaSiswa;
    }
    String getNamaSiswa(){
        return namaSiswa;
    }
    void setKelamin(String kelamin){
        this.kelamin = kelamin;
    }
    String getKelamin(){
        return kelamin;
    }
    void setKelas(Kelas kelas){
        this.kelas = kelas;
    }
    Kelas getKelas(){
        return kelas;
    }
    void setAlamatSiswa(String alamatSiswa){
        this.alamatSiswa = alamatSiswa;
    }
    String getAlamatSiswa(){
        return alamatSiswa;
    }
    String info(){
        String info = "";
        info +="Nis: "+nis+"\n";
        info +="Nama Mahasiswa: "+namaSiswa+"\n";
        info +="Alamat Mahasiswa: "+alamatSiswa+"\n";
        info +=kelas.info();
        info +="Kelamin: "+kelamin+"\n";
        return info;
    }
}
