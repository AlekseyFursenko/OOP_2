package Units.Intellect;

public class Warlock extends Intellect{
    int healing;

    public Warlock(String name) {
        super(name,
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

    @Override
    public void step(){
        System.out.println("I call upon the ancient power!");
    }
    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s Mana: %s ",
                NAME, (int)(this.hp), this.getClass().getSimpleName(), this.magic_mana));
    }

}
