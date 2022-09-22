package tugas4sampai6;

public class Anggota {
    private String nomorKTP,nama;

    private int limitPinjam,jumlahPinjam;

    Anggota(String nomorKTP, String nama, int limitPinjam){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    public String getNama(){
        return nama;
    }
    public int getJumlahPinjam(){
        return jumlahPinjam;
    }
    public int getLimitPinjam(){
        return limitPinjam;
    }
    public void pinjam(int newValue){
        if (newValue > limitPinjam){
            System.out.println("Maaf, jumlah pinjam melebihi limit");
        }
        else {
            jumlahPinjam = newValue;
        }
    }
    public void angsur(int newValue){
        if (newValue >= 0.1 * jumlahPinjam && jumlahPinjam != 0 ){
            jumlahPinjam -=newValue;
        }
        else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
