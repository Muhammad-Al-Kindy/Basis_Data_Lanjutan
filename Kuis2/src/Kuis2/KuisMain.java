package Kuis2;

public class KuisMain {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops trice = new Triceratops();
        Oviraptor ovira = new Oviraptor();
        Pemburu pemburu = new Pemburu();
        AnakPemburu anak = new AnakPemburu();

        pemburu.berburu(trex);
        anak.mengambilTelur(trex);
        System.out.println();
        anak.berburu(trex);
        System.out.println();

        pemburu.berburu(trice);
        anak.mengambilTelur(trice);
        System.out.println();
        anak.berburu(trice);
        System.out.println();

        pemburu.berburu(ovira);
        anak.mengambilTelur(ovira);
        System.out.println();
        anak.berburu(trice);
        System.out.println();
    }
}
