package Units.Servant;

import Units.Unit;

public abstract class Servant extends Unit {
    public Servant(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int x, int y) {
        super(name, maxHp, damage, speed, attack, defence, alive, x, y);
    }
}
