package Units.Warrior;

import Units.Unit;

import java.util.ArrayList;

public class Spearman extends Warrior{
    public Spearman(String name, int x, int y) {
        super(name,
                10,
                new int[] {1,3},
                4,
                4,
                5,
                true,
                x, y);
    }

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends) {
        if(alive){System.out.println("We are under attack!");}
        super.step(enemies, friends);
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s  Type: %s Attack: %d ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.attack));
    }
}
