package kindy.tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    public void heal(){
        if (level == 1){
            super.health += (int) (0.3 * super.health);
        }else if (level == 2){
            super.health += (int) (0.4 * super.health);
        }else if (level == 3){
            super.health += (int) (0.5 * super.health);
        }
    }
    public void destroyed(){
        super.health -= (int) (0.1 * super.health);
    }
    public String getZombieInfo(){
        String info ="Jumping Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}
