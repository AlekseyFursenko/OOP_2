package Units.Intellect;

public class Warlock extends Intellect{
    int healing;

    public Warlock() {
        super("Warlok",
                30,
                new int[] {-5,-5},
                9,
                17,
                12,
                true,
                1);
        this.healing = 5;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public void to_heal(){};

}
