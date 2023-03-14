package Units.Warrior;

import Units.Unit;

import java.util.ArrayList;

public class Robber extends Warrior{
    public Robber(String name ) {
        super(name,
                10,
                new int[] {2,4},
                6,
                8,
                3,
                true);
    }

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends) {
        System.out.println("It'll be painless, I promise.");
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s Attack: %d ",
                NAME, (int)(this.hp), this.getClass().getSimpleName(), this.attack));
    }

}
