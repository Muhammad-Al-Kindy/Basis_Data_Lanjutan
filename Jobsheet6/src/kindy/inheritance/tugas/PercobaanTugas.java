package kindy.inheritance.tugas;

public class PercobaanTugas {
    public static void main(String[] args) {
        Pegawai pg = new Pegawai("2131710057","Kindy","Jalan Kebon Bawang");
        Dosen dosen = new Dosen(pg.nip,pg.nama,pg.alamat);
        dosen.setJumlahSKS(20);
        dosen.setTarifSKS(200000);
        Pegawai pg2 = new Pegawai("2131710056","Retha","Surabaya");
        Dosen dosen2 = new Dosen(pg2.nip,pg2.nama,pg2.alamat);
        dosen2.setJumlahSKS(10);
        dosen2.setTarifSKS(200000);
        DaftarGaji dg = new DaftarGaji(3);
        dg.addPegawai(dosen);
        dg.addPegawai(dosen2);
        dg.printSemuaGaji();
    }
}
