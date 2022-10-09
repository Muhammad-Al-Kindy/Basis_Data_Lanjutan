package kindy.relasiclass.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    Laptop(){

    }
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    void setMerk(String merk){
        this.merk = merk;
    }
    String getMerk(){
        return merk;
    }
    void setProc(Processor proc){
        this.proc = proc;
    }
    Processor getProc(){
        return proc;
    }
    void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}
