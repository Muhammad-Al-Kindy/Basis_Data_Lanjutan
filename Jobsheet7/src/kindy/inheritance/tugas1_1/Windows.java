package kindy.inheritance.tugas1_1;

public class Windows extends Laptop{
    String fitur;

    Windows(){

    }
    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,
            String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur                    ="+fitur);
    }
}
