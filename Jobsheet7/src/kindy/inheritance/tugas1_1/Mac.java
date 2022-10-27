package kindy.inheritance.tugas1_1;

public class Mac extends Laptop{
    String security;

    Mac(){

    }
    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,
        String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security ="+security);
    }
}
