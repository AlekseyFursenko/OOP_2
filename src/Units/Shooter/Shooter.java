package Units.Shooter;

import Units.Unit;

public abstract class Shooter extends Unit {
    int  shoot_dist;
    int shoots;

    public Shooter(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive, int shoot_dist, int shoots) {
        super(name, hp, damage, speed, attack, defence, alive);
        this.shoot_dist = shoot_dist;
        this.shoots = shoots;
    }

    public int getShoot_dist() {
        return shoot_dist;
    }

    public void setShoot_dist(int shoot_dist) {
        this.shoot_dist = shoot_dist;
    }

    public int getShoots() {
        return shoots;
    }

    public void setShoots(int shoots) {
        this.shoots = shoots;
    }

    public void take_aim(){};
}
