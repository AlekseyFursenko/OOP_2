package Units.Intellect;

import Units.Unit;
import Units.UnitInrfce;

import java.util.ArrayList;

public class Monk extends Intellect {
    int healing;

    public Monk(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int healing, int magic_mana, int x, int y) {
        super(name, maxHp, damage, speed, attack, defence, alive, magic_mana,x,y);
        this.healing = healing;
    }

    public Monk(String name, int x, int y) {
        super(name,
                30,
                new int[] {-4,-4},
                5,
                12,
                7,
                true,
                1,
                x, y);
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public void to_heal(){};

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends){
        if(alive){System.out.println("Amen to that, brother!");}
        super.step(enemies,friends);
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s Type: %s Mana: %s ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.magic_mana));
    }

}
