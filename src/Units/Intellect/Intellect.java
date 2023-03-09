package Units.Intellect;

import Units.Unit;

public abstract class Intellect extends Unit {
    int magic_mana;

    public Intellect(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive, int magic_mana) {
        super(name, hp, damage, speed, attack, defence, alive);
        this.magic_mana = magic_mana;
    }
    public int getMagic_mana() {
        return magic_mana;
    }

    public void setMagic_mana(int magic_mana) {
        this.magic_mana = magic_mana;
    }
}
