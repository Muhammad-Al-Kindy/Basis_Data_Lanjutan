package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            if (kecepatan >=0 && kecepatan < 100){
            kecepatan +=5;
            }
            else if (kecepatan >= 100){
                kecepatan = 100;
            }
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn ==true){
            if (kecepatan >=0 && kecepatan < 100){
                kecepatan -=5;
            }
            else if (kecepatan == 0){
                kecepatan = 0;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Konyak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
