package kindy.inheritance.percobaan2_2;
public class Manager extends Karyawan {
    int tunjangan;

    Manager(){

    }
    void tampilDataManager(){
        super.tampilDataPegawai();
        System.out.println("Tunjangan          ="+tunjangan);
        System.out.println("Total Gaji         ="+(super.gaji+tunjangan));
    }
}