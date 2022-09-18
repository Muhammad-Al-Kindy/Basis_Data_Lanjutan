package sepatudemo;

public class SepatuBola extends Sepatu{
    private int pul;

    public void setPul(int newValue){
        pul = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Pul : "+pul);
    }

}
