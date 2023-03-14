package Units.Shooter;

import Units.Servant.Pesant;
import Units.Unit;

import java.util.ArrayList;

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

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends) {
        if(this.shoots>0 && this.alive== true){
            System.out.println("Please, tell me, where am I aiming now?");
            for (Unit unit:enemies){
                if(unit.getHp()>0){
                    this.to_attack(unit, this.damage);
                    this.shoots--;
                    break;
                }
            }

            for (Unit unit : friends) {
                if (unit.equals("Pesant") && unit.isAlive() == true) {
                    this.shoots++;
                    break;
                }
            }
        }


    }
}
