package Units.Intellect;

import Units.Unit;

public abstract class Intellect extends Unit {
    int magic_mana;

    public Intellect(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int magic_mana, int x, int y) {
        super(name, maxHp, damage, speed, attack, defence, alive, x, y);
        this.magic_mana = magic_mana;
    }
    public int getMagic_mana() {
        return magic_mana;
    }

    public void setMagic_mana(int magic_mana) {
        this.magic_mana = magic_mana;
    }
}
