package kindy.inheritance.percobaan1_1;

public class Manager extends Karyawan{
    int tunjangan;

    Manager(){

    }
    void tampilDataManager(){
        super.tampilDataPegawai();
        System.out.println("Tunjangan          ="+tunjangan);
        System.out.println("Total Gaji         ="+(super.gaji+tunjangan));
    }
}
