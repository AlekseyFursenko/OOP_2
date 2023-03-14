package Units.Shooter;

import Units.Unit;

import java.util.ArrayList;

public class XBowman extends Shooter{

    public XBowman(String name) {
        super(name,
                10,
                new int[] {2,3},
                4,
                6,
                3,
                true,
                5,
                16);
    }

    //@Override
    //public void step(ArrayList<Unit> enimies, ArrayList<Unit> friends) {
    //    System.out.println("Here is my crossbow!");
    //}

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s  Type: %s Shoots: %d ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.shoots));
    }

}
