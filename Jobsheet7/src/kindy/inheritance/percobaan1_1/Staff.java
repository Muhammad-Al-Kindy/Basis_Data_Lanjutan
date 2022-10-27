package kindy.inheritance.percobaan1_1;

public class Staff extends Karyawan{
    int lembur, potongan;

    Staff(){

    }
    Staff(String nama,String alamat, int umur,String jk,
          int gaji, int lembur, int potongan){
        super(nama,alamat,umur,jk,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    void tampilDataStaff(){
        super.tampilDataPegawai();
        System.out.println("Lembur             ="+lembur);
        System.out.println("Potongan           ="+potongan);
        System.out.println("Total Gaji         ="+(gaji+lembur-potongan));
    }
}
