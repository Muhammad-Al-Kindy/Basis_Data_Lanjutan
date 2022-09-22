package tugas1sampai3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newValue){
        name = newValue;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if (newAge >= 18 && newAge <=30){
            age = newAge;
        }
        else if (newAge < 18){
            System.out.println("Umur di bawah 18 tahun");;
        }
        else if (newAge > 30){
            System.out.println("Umur di atas 30 tahun");
        }
    }
}
