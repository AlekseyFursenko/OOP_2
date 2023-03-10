package Units.Shooter;

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

    @Override
    public void step() {
        System.out.println("Here is my crossbow!");
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s Shoots: %d ",
                NAME, (int)(this.hp), this.getClass().getSimpleName(), this.shoots));
    }

}
