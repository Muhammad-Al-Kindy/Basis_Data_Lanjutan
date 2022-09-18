package jamdemo;

public class JamDemo {
    public static void main(String[] args) {
        JamDinding jam = new JamDinding();
        JamWeker jamWeker = new JamWeker();

        jam.setMerek("Seiko");
        jam.setWarna("Black & White");
        jam.setBentuk("Lingkaran");
        jam.cetakStatus();
        System.out.println();

        jamWeker.setMerek("Sonic Alert");
        jamWeker.setWarna("Black & Red");
        jamWeker.setBentuk("Lingkaran dengan peyangga di bawahnya");
        jamWeker.setTipe("Noise Alarm Clock");
        jamWeker.cetakStatus();
    }
}
