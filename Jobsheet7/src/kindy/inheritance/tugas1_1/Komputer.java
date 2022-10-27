package kindy.inheritance.tugas1_1;

public class Komputer {
    String merk, jnsProsesor;
    int kecProsesor, sizeMemory;

    Komputer(){

    }
    Komputer(String merk, int kecProsesor, int sizeMemory,
             String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    void tampilData(){
        System.out.println("Nama Merk                ="+merk);
        System.out.println("Kecepatan Prosesor       ="+kecProsesor);
        System.out.println("Size Memory              ="+sizeMemory);
        System.out.println("Jenis Prosesor           ="+jnsProsesor);
    }
}
