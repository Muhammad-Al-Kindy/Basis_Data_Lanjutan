package kindy.relasiclass.tugas;

public class Absensi {
    private String pertemuan,hari;
    private int jam;
    private Mahasiswa mahasiswa;
    private Dosen dosen;

    Absensi(String pertemuan, String hari, int jam, Mahasiswa mahasiswa){
        this.pertemuan = pertemuan;
        this.hari = hari;
        this.jam = jam;
        this.mahasiswa = mahasiswa;
    }
    Absensi(String pertemuan,String hari, int jam, Dosen dosen){
        this.pertemuan = pertemuan;
        this.hari = hari;
        this.jam = jam;
        this.dosen = dosen;
    }
    void setPertemuan(String pertemuan){
        this.pertemuan = pertemuan;
    }
    String getPertemuan(){
        return pertemuan;
    }
    void setHari(String hari){
        this.hari = hari;
    }
    String getHari(){
        return hari;
    }
    void setJam(int jam){
        this.jam = jam;
    }
    int getJam(){
        return jam;
    }
    void setMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    Mahasiswa getMahasiswa(){
        return mahasiswa;
    }
    void setDosen(Dosen dosen){
        this.dosen = dosen;
    }
    Dosen getDosen(){
        return dosen;
    }
    String infoDosen(){
        String info = "";
        info += dosen.info();
        info += "Pertemuan: "+pertemuan+"\n";
        info += "Hari: "+hari+"\n";
        info += "Jam: "+jam+"\n";
        return info;
    }
    String infoMahasiswa(){
        String info = "";
        info += mahasiswa.info();
        info += "Pertemuan: "+pertemuan+"\n";
        info += "Hari: "+hari+"\n";
        info += "Jam: "+jam+"\n";
        return info;
    }
}
