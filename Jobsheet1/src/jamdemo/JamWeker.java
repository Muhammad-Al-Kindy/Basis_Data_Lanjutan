package jamdemo;

public class JamWeker extends JamDinding{
    private String tipe;

    public void setTipe(String newValue){
        tipe = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Alarm : "+tipe);
    }
}
