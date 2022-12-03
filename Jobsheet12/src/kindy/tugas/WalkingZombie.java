package kindy.tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    public void heal(){
        if (level == 1){
            super.health += (int) (0.1 * super.health);
        }else if (level == 2){
            super.health += (int) (0.3 * super.health);
        }else if (level == 3){
        super.health += (int) (0.4 * super.health);
        }
    }
    public void destroyed(){
        super.health -= (int) (0.2 * super.health);
    }
    public String getZombieInfo(){
        String info ="Walking Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}
