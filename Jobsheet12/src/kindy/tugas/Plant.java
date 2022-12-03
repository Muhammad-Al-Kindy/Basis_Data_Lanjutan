package kindy.tugas;

public class Plant {
    public void doDestroy(Destroyable d){
        if (d instanceof WalkingZombie){
            WalkingZombie wZombie = (WalkingZombie) d;
            wZombie.destroyed();
        }else if (d instanceof JumpingZombie){
            JumpingZombie jZombie = (JumpingZombie) d;
            jZombie.destroyed();
        }else if (d instanceof Barrier){
            Barrier barrier = (Barrier) d;
            barrier.destroyed();
        }
    }
}
