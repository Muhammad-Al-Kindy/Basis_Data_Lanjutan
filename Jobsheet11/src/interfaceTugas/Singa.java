package interfaceTugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara,warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t\t\t: Daging");
    }
    public void displayBinatang(){
        System.out.println("Jenis\t\t\t\t: Karnivora");
    }

    public void displayData(){
        super.displayBinatang();
        System.out.println("Suara Singa\t\t\t: "+suara);
        System.out.println("Warna bulu Singa\t: "+warnaBulu);
    }
}
