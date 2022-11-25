package kindy.interfaces;

public class Cow implements IFoodAnimal,InterfaceAnimal{
    @Override
    public void food() {
        System.out.println("Sapi makan Rumput");
    }

    @Override
    public void animalSound() {
        System.out.println("The Cow Says: Mowwww... Mowwwww...");
    }

    @Override
    public void sleep() {
        System.out.println("The Cow Sleep: Sapi tidur: Zzzzzzzzzzzz");
    }
}
