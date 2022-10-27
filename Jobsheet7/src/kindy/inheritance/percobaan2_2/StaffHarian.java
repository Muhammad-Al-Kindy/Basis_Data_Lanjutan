package kindy.inheritance.percobaan2_2;

public class StaffHarian extends Staff{
    int jmlJamKerja;

    StaffHarian(){

    }
    StaffHarian(String nama, String alamat, int umur, String jk,
                int gaji, int lembur,int potongan, int jmlJamKerja){
        super(nama,alamat,umur,jk,gaji,lembur,potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    void tampilStaffHarian(){
        super.tampilDataStaff();
        System.out.println("Jumlah jam kerja   = "+jmlJamKerja);
        System.out.println("Gaji Bersih        = "+(gaji*jmlJamKerja+lembur-potongan));
    }
}
