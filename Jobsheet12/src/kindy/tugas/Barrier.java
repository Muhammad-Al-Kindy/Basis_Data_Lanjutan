package kindy.tugas;

public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
    @Override
    public void destroyed() {
        strength -=9;
    }
    public String getBarrierInfo(){
        String info ="";
        info += "Barrier Strength\t= "+strength;
        return info;
    }
}
