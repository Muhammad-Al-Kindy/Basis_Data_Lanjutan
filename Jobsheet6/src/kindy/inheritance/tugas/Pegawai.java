package kindy.inheritance.tugas;

public class Pegawai {
    String nip,nama,alamat,nomor;
    Dosen dosen;
    protected Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    protected String getNama(){
        return nama;
    }

    protected int getGaji() {
       return dosen.getGaji();
    }
}
