package Units.Intellect;

public class Monk extends Intellect{
    int healing;

    public Monk(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive, int healing, int magic_mana) {
        super(name, hp, damage, speed, attack, defence, alive, magic_mana);
        this.healing = healing;
    }

    public Monk() {
        super("Monk",
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
}
