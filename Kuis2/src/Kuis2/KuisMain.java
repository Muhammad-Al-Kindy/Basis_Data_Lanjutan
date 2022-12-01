package Kuis2;

public class KuisMain {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops trice = new Triceratops();
        Oviraptor ovira = new Oviraptor();

        Pemburu pemburu = new Pemburu();
        pemburu.berburu(trex);
        AnakPemburu anak = new AnakPemburu();
        anak.mengambilTelur(trex);
    }
}
