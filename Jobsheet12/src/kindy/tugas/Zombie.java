package kindy.tugas;

public class Zombie implements Destroyable{
    protected int health,level;

    public void heal(){
//        health +=
    }
    @Override
    public void destroyed(){

    }
    public String getZombieInfo(){
        String info ="";
        info += "Health\t= "+health+"\nLevel\t= "+level+"\n";
        return info;
    }
}
