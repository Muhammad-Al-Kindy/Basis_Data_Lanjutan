package kindy.inheritance.tugas;

public class Dosen extends Pegawai{
    int jumlahSKS, tarifSKS;

    protected Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    protected void setJumlahSKS(int jumlahSKS){
        this.jumlahSKS =jumlahSKS;
    }

    protected void setTarifSKS(int tarifSKS){
        this.tarifSKS = tarifSKS;
    }

    protected int getGaji(){
        return tarifSKS*jumlahSKS;
    }
}
