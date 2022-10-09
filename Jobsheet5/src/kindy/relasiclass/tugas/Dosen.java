package kindy.relasiclass.tugas;

public class Dosen {
    private String nip,namaGuru,alamatGuru,mataPelajaran,kelamin;

    Dosen(String nip, String namaGuru, String alamatGuru, String mataPelajaran,
          String kelamin){
        this.nip = nip;
        this.namaGuru = namaGuru;
        this.alamatGuru = alamatGuru;
        this.mataPelajaran = mataPelajaran;
        this.kelamin = kelamin;
    }
    void setNip(String nip){
        this.nip = nip;
    }
    String getNip(){
        return nip;
    }
    void setNamaGuru(String namaGuru){
        this.namaGuru = namaGuru;
    }
    String getNamaGuru(){
        return namaGuru;
    }
    void setAlamatGuru(String alamatGuru){
        this.alamatGuru = alamatGuru;
    }
    String getAlamatGuru(){
        return alamatGuru;
    }
    void setMataPelajaran(String mataPelajaran){
        this.mataPelajaran = mataPelajaran;
    }
    String getMataPelajaran(){
        return mataPelajaran;
    }
    void setKelamin(String kelamin){
        this.kelamin = kelamin;
    }
    String getKelamin(){
        return kelamin;
    }
    String info(){
        String info = "";
        info +="Nip: "+nip+"\n";
        info +="Nama Dosen: "+namaGuru+"\n";
        info +="Alamat Dosen: "+alamatGuru+"\n";
        info +="Mata Kuliah: "+mataPelajaran+"\n";
        info +="Kelamin: "+kelamin+"\n";
        return info;
    }
}
