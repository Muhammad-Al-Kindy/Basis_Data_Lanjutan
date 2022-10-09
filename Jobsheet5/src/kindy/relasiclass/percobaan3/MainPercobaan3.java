package kindy.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masisnis = new Pegawai("1234","Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567","Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masisnis,asisten);
        System.out.println(keretaApi.info());

        Pegawai masisnis1 = new Pegawai("1234","Spongebob Squarepants");
        KeretaApi keretaApi1 = new KeretaApi("Gaya Baru","Bisnis",masisnis1);
        System.out.println(keretaApi1.infoTanpaAsisten());
    }
}
