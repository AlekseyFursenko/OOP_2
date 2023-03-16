package Units;

import java.util.ArrayList;

public abstract class Unit implements UnitInrfce{
    protected final String NAME;
    protected float hp;
    protected int[] damage;
    protected int speed;
    protected int attack;
    protected int defence;
    protected boolean alive;
    protected Position position;

    public Unit(String name, float hp, int[] damage, int speed, int attack, int defence, boolean alive, int x, int y) {
        NAME = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.alive = alive;
        position = new Position(x,y);
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

    public void setHp(float hurt) {
        if (this.hp - hurt > 0) {
            this.hp -= hurt;
        }
        else{
            this.hp = 0;
            setAlive(false);
        }
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

    public String getPosition() {
        return String.format("x = % d, y = %d", position.getX(), position.getY());
    }

    protected Unit findNearest(ArrayList<Unit> team) {
        float minDist = 10;// максимальный размер игрового поля
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            float dist = position.getDist(team.get(i).position);
            if (dist < minDist && team.get(i).isAlive()) {
                minDist = dist;
                index = i;
            }
        }
        return team.get(index);
    }

    public void to_attack(Unit enemy, int[] damage) {
        float hurt = (damage[1] + damage[0]) / 2;
        enemy.setHp(hurt);
        System.out.printf("%s %s has attacked %s %s\t", this.getClass().getSimpleName(),NAME, enemy.getClass().getSimpleName(), enemy.NAME);
        System.out.printf(" Hurt = %f\n", hurt);
        System.out.printf("%s %s hp= %.2f\n", enemy.getClass().getSimpleName(), enemy.NAME, enemy.getHp());

    }

    public boolean to_die(){ return this.alive = false;};

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s",
                NAME, (int)(this.hp), this.getClass().getSimpleName()));
    }

    @Override
    public void step(ArrayList<Unit> enimies, ArrayList<Unit> friends) {

        System.out.println("Step!");

    }

    @Override
    public String toString() {
        return String.format("Name: %-11s  Hp: %-3d Speed: %-3s  Type: %-11s",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName());
    }

}
