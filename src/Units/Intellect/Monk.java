package Units.Intellect;

import Units.UnitInrfce;

public class Monk extends Intellect {
    int healing;

    public Monk(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive, int healing, int magic_mana) {
        super(name, hp, damage, speed, attack, defence, alive, magic_mana);
        this.healing = healing;
    }

    public Monk(String name) {
        super(name,
                30,
                new int[] {-4,-4},
                5,
                12,
                7,
                true,
                1);
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public void to_heal(){};

    @Override
    public void step(){
        System.out.println("Amen to that, brother!");
    }
    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s Mana: %s ",
                NAME, (int)(this.hp), this.getClass().getSimpleName(), this.magic_mana));
    }

}
