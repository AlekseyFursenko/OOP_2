package Units.Warrior;

import Units.Unit;

import java.util.ArrayList;


public abstract class Warrior extends Unit{
    public Warrior(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int x, int y) {
        super(name, maxHp, damage, speed, attack, defence, alive, x, y);
    }
    @Override
    public void step(ArrayList<Unit> enimies, ArrayList<Unit> friends) {
        Unit target = findNearest(enimies);
        if (alive) {
            if (position.getDist(target.getPosition()) < 1.5) {
                if (target.getDefence() < this.attack) {
                    this.to_attack(target,(damage[1]));
                } else {
                    this.to_attack(target,(damage[0]));
                }
            } else {
                this.move(target, friends);
            }
        }
    }
}
