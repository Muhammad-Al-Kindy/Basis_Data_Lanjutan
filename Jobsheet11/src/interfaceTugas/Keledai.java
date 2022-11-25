package interfaceTugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara,warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t\t\t: Tumbuhan");
    }

    public void displayBinatang(){
        System.out.println("Jenis\t\t\t\t: Herbivora");
    }

    public void displayData(){
        super.displayBinatang();
        System.out.println("Suara Keledai\t\t: "+suara);
        System.out.println("Warna bulu Keledai\t: "+warnaBulu);
    }
}
