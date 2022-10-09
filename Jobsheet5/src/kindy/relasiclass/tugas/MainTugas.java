package kindy.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Kelas kelas = new Kelas("Tujuh A","7A");
        Mahasiswa mahasiswa = new Mahasiswa("2131710057","Muhammad Al Kindy",
                "Jalan Kebon Bawang XI","Pria",kelas);
        Dosen dosen = new Dosen("21317100","Pak Usman Nur Hasan",
                "Soekarno Hatta","Pemrograman Berbasis Objek",
                "Pria");
        Absensi absensiGuru = new Absensi("1","Selasa",3, dosen);
        Absensi absensiSiswa = new Absensi("1","Senin",2, mahasiswa);
        System.out.println("Absensi Dosen");
        System.out.println(absensiGuru.infoDosen());
        System.out.println("Absensi Mahasiswa");
        System.out.println(absensiSiswa.infoMahasiswa());
    }
}
