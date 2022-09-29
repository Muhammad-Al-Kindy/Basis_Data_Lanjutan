package Pegawai;

public class Pegawai {
    private String Nama,NIP;
    private double gajiPokok,lembur,uangMakan,transport,totalGaji;
    private int jumlahJamKerja;

    Pegawai(String Nama, String NIP, int jamKerja){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jamKerja;
    }
    void setGajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
    }
    void setUangMakan(){
        if (jumlahJamKerja >= 8){
            uangMakan = (jumlahJamKerja - 7) * 3500;
        }
        else {
            uangMakan = 0;
        }
    }
    void setTransport(){
        if (jumlahJamKerja >= 9){
            transport = (jumlahJamKerja - 8) * 4000;
        }
        else {
            transport = 0;
        }
    }
    void setLembur(){
        if (jumlahJamKerja > 7){
            lembur = ((jumlahJamKerja - 7) * (1.5 * gajiPokok));
        }
        else {
            lembur = 0;
        }
    }
    void hitungGajiHarian(){
        totalGaji = gajiPokok + lembur + uangMakan +transport;
    }
    void cetakPenghasilan(){
        System.out.println("========= Gaji Karyawan ========");
        System.out.println("Nama Karyawan\t\t: "+Nama);
        System.out.println("NIP Karyawan\t\t: "+NIP);
        System.out.println("Jumlah Jam Kerja\t: "+jumlahJamKerja);
        System.out.println("======== Dengan Rincian ========");
        System.out.println("Gaji Pokok\t: "+gajiPokok);
        System.out.println("Uang Makan\t: "+uangMakan);
        System.out.println("Lembur\t\t: "+lembur);
        System.out.println("Transport\t: "+transport);
        System.out.println("Total Gaji\t: "+totalGaji);
    }
}
