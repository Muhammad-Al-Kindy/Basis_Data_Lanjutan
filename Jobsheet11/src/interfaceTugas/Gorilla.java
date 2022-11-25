package interfaceTugas;

public class Gorilla extends Binatang implements IKarnivora,IHerbivora{
    private String suara,warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t\t\t: Daging + Tumbuhan");
    }

    public void displayBinatang(){
        System.out.println("Jenis\t\t\t\t: Karnivora + Herbivora");
    }

    public void displayData(){
        super.displayBinatang();
        System.out.println("Suara Gorilla\t\t: "+suara);
        System.out.println("Warna bulu Gorilla\t: "+warnaBulu);
    }
}
