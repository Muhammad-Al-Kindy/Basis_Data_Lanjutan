package kindy.inheritance.tugas;

public class DaftarGaji {
    Pegawai [] listPegawai;

    protected DaftarGaji(int jumlah){
        listPegawai = new Pegawai[jumlah];
    }
    protected void addPegawai(Dosen baru){
        for (int i =0; i< listPegawai.length;i++){
            if (listPegawai[i] == null){
                listPegawai[i] = baru;
                break;
            }
        }
    }
    protected void printSemuaGaji(){
        for (int i =0; i< listPegawai.length;i++){
            if (listPegawai[i] != null){
                System.out.println("NIP Pegawai: "+listPegawai[i].nip);
                System.out.println("Nama Pegawai: "+listPegawai[i].nama);
                System.out.println("Alamat Pegawai: "+listPegawai[i].alamat);
                System.out.println("Gaji Pegawai: "+listPegawai[i].getGaji());
                System.out.println();
            }
        }
    }
}
