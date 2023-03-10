package Units.Warrior;

public class Spearman extends Warrior{
    public Spearman(String name) {
        super(name,
                10,
                new int[] {1,3},
                4,
                4,
                5,
                true);
    }

    @Override
    public void step() {
        System.out.println("We are under attack!");
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s Attack: %d ",
                NAME, (int)(this.hp), this.getClass().getSimpleName(), this.attack));
    }
}
