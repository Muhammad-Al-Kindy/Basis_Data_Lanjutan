package kindy.interfaces;

public class Horse implements IFeet{
    @Override
    public void feet() {
        System.out.println("Kuda memiliki 4 kaki");
    }

    @Override
    public void soundFeet() {
        System.out.println("Kuda berjalan : tuk kitakituk");
    }
}
