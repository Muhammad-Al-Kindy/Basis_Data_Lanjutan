package kindy.inheritance.tugas1_1;

public class Laptop extends Komputer{
    String jnsBatrei;

    Laptop(){

    }
    Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,
           String jnsBatrei){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Batrei             ="+jnsBatrei);
    }
}
