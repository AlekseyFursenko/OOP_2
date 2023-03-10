package Units;

public abstract class Unit implements UnitInrfce{
    protected final String NAME;
    protected float hp;
    protected int[] damage;
    protected int speed;
    protected int attack;
    protected int defence;
    protected boolean alive;

    public Unit(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive) {
        NAME = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.alive = alive;
    }

    public void getName() {
        System.out.println(NAME);
    }

    public float getHp() {
        return hp;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setDamage(int[] damage) {
        this.damage = damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void to_move(int speed){}

    public void to_attack(int damage){};

    public void to_die(){};

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s",
                NAME, (int)(this.hp), this.getClass().getSimpleName()));
    }

    @Override
    public void step() {

        System.out.println("Step!");

    }

}
