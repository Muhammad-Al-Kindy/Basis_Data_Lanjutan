package interfaceTugas;

public class interfaceTugasMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai",4,"Hehehehe","Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali",4,"Haaum Haaum","Hitam Manis");
        Singa singa = new Singa("CingaCing",4,"Roaar Roaar","Coklat");
        // bagian Keledai
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();
        // bagian Gorilla
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        System.out.println();
        // bagian Singa
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
    }
}
