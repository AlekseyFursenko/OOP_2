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
    protected int posX;
    protected int posY;

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

    public void to_attack(Unit enemy, int[] damage) {
        float hurt = (damage[1] + damage[0]) / 2;
        enemy.setHp(hurt);
        System.out.printf("%s to attack %s\t", this.getClass().getSimpleName(), enemy.getClass().getSimpleName());
        System.out.printf(" Hurt = %d\n", hurt);
        System.out.printf("%s hp= %.2f\n", enemy.getClass().getSimpleName(), enemy.getHp());

    }

    public boolean to_die(){ return this.alive = false;};

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s",
                NAME, (int)(this.hp), this.getClass().getSimpleName()));
    }

    @Override
    public void step(ArrayList<Unit> enimies, ArrayList<Unit> friends) {

        System.out.println("Step!");

    }

}
