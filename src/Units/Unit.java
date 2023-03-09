package Units;

public abstract class Unit {
    protected String name;
    protected float hp;
    protected int[] damage;
    protected int speed;
    protected int attack;
    protected int defence;
    protected boolean alive;

    public Unit(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.alive = alive;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
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

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, (int)(this.hp), this.getClass().getSimpleName());
    }

}
