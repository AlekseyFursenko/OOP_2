package Units.Servant;

import Units.Unit;

public abstract class Servant extends Unit {
    public Servant(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive) {
        super(name, hp, damage, speed, attack, defence, alive);
    }
}
