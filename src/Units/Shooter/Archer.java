package Units.Shooter;

import Units.Unit;

import java.util.ArrayList;

public class Archer extends Shooter{

    public Archer(String name, int x, int y) {
        super(name,
                32,
                new int[] {8,10},
                9,
                12,
                10,
                true,
                8,
                32,
                x, y);
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s  Type: %s Shoots: %d ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.shoots));
    }

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends) {
        if (alive) {
            System.out.println("Please, tell me, where am I aiming now?");
        }
        super.step(enemies, friends);
    }

}

