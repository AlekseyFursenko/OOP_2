package Units;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public abstract class Unit implements UnitInrfce{
    protected final String NAME;
    protected float hp;



    protected int maxHp;
    protected int[] damage;
    protected int speed;
    protected int attack;
    protected int defence;
    protected boolean alive;
    protected Position position;

    public Unit(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int x, int y) {
        NAME = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
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

    public String getTYPE(){ return String.format(this.getClass().getSimpleName());}

    public int getMaxHp() { return maxHp; }
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
            this.hp = Math.min(hp - hurt, maxHp);
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

    public Position getPosition() {
        return position;
    }

    protected Unit findNearest(ArrayList<Unit> team) {
        float minDist = 15;// максимальный размер игрового поля
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

    public void to_attack(Unit enemy, float hurt) {
        enemy.setHp(hurt);
        System.out.printf("%s %s has attacked %s %s\t", this.getClass().getSimpleName(),NAME, enemy.getClass().getSimpleName(), enemy.NAME);
        System.out.printf(" Hurt = %f\n", hurt);
        System.out.printf("%s %s hp= %.2f\n", enemy.getClass().getSimpleName(), enemy.NAME, enemy.getHp());

    }
    public void to_heal(Unit friend, float heal) {
        friend.setHp(heal);
        System.out.printf("%s %s has healed %s %s\t", this.getClass().getSimpleName(),NAME, friend.getClass().getSimpleName(), friend.NAME);
        System.out.printf(" Hurt = %f\n", heal);
        System.out.printf("%s %s hp= %.2f\n", friend.getClass().getSimpleName(), friend.NAME, friend.getHp());

    }

    public boolean to_die(){ return this.alive = false;};

    public void move(Unit target, ArrayList<Unit> friends) {
        Position temp = this.position;
        int dX = this.position.getX() - target.position.getX();
        int dY = this.position.getY() - target.position.getY();
        if (Math.abs(dX) >= Math.abs(dY)) {
            if (dX > 0) {
                temp.setX(temp.getX() - 1);
                if (checkCells(temp, friends)) {
                    this.position.setX(this.position.getX() - 1);
                }
            } else {
                temp.setX(temp.getX() + 1);
                if (checkCells(temp, friends)) {
                    this.position.setX(this.position.getX() + 1);
                }
            }
        } else {
            if (dY > 0) {
                temp.setY(temp.getY() - 1);
                if (checkCells(temp, friends)) {
                    this.position.setY(this.position.getY() - 1);
                }
            } else {
                temp.setY(temp.getY() + 1);
                if (checkCells(temp, friends)) {
                    this.position.setY(this.position.getY() + 1);
                }
            }
        }
    }

    public boolean checkCells(Position newPosition, ArrayList<Unit> friends) {
        for (Unit friend : friends) {
            if (newPosition.isEquals(friend.position)) return false;
        }
        return true;
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d  Type: %s",
                NAME, (int)(this.hp), this.getClass().getSimpleName()));
    }

    @Override
    public String toString() {
        return String.format("\t%-12s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%", this.getTYPE(), attack, defence, (int)(hp * 100 / maxHp));
    }

}
