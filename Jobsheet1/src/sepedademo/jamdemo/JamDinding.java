package jamdemo;

public class JamDinding {
    private String merek,warna,bentuk;

    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void setBentuk(String newValue){
        bentuk = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merek  : "+ merek);
        System.out.println("Warna  : "+ warna);
        System.out.println("Bentuk : " + bentuk);
    }
}
