package kindy.inheritance.percobaan1_1;

public class Karyawan {
    String nama,alamat,jk;
    int umur,gaji;

    Karyawan(){

    }
    Karyawan(String nama, String alamat, int umur,
             String jk, int gaji){
        this.nama =nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }
    void tampilDataPegawai(){
        System.out.println("Nama               ="+nama);
        System.out.println("Alamat             ="+alamat);
        System.out.println("Jenis Kelamin      ="+jk);
        System.out.println("Umur               ="+umur);
        System.out.println("Gaji               ="+gaji);
    }
}
