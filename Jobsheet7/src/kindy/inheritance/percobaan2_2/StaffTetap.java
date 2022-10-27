package kindy.inheritance.percobaan2_2;

public class StaffTetap extends Staff{
    String golongan;
    int Asuransi;

    StaffTetap(){

    }
    StaffTetap(String nama, String alamat, int umur, String jk,
               int gaji, int lembur,int potongan, String golongan,
               int Asuransi){
        super(nama,alamat,umur,jk,gaji,lembur,potongan);
        this.golongan = golongan;
        this.Asuransi = Asuransi;
    }
    void tampilStaffTetap(){
        super.tampilDataStaff();
        System.out.println("Golongan           ="+golongan);
        System.out.println("Jumlah Asuransi    ="+Asuransi);
        System.out.println("Gaji Bersih        ="+(gaji+lembur-potongan-Asuransi));
    }
}
