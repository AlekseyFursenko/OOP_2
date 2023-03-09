package Units.Warrior;

import Units.Unit;

public abstract class Warrior extends Unit {
    public Warrior(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive) {
        super(name, hp, damage, speed, attack, defence, alive);
    }
}
