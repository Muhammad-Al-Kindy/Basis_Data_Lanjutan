package kindy.interfaces;

public class Pig implements IFoodAnimal,InterfaceAnimal{

    @Override
    public void food() {
        System.out.println("Babi makan daging dan tumbuhan");
    }

    @Override
    public void animalSound() {
        System.out.println("The Pig Says: Oink... Oink...");
    }

    @Override
    public void sleep() {
        System.out.println("The Pig Sleep: Zzzzz");
    }
}
