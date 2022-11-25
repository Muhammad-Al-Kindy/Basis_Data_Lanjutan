package kindy.interfaces;

public class MainInterface {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        Cow mycow = new Cow();
        Horse myhorse = new Horse();

        System.out.println("Pig");
        mypig.food();
        mypig.animalSound();
        mypig.sleep();

        System.out.println("Cow");
        mycow.food();
        mycow.animalSound();
        mycow.sleep();

        System.out.println("Horse");
        myhorse.feet();
        myhorse.soundFeet();
    }
}
