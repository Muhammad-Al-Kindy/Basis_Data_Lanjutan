package interfacelatihan;
public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        pakrektor.beriSertifikatCumlaude(mhaBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
