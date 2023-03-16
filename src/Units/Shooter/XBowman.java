package Units.Shooter;

import Units.Unit;

import java.util.ArrayList;

public class XBowman extends Shooter{

    public XBowman(String name, int x, int y) {
        super(name,
                10,
                new int[] {2,3},
                4,
                6,
                3,
                true,
                5,
                16,
                x, y);
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s  Type: %s Shoots: %d ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.shoots));
    }

}
