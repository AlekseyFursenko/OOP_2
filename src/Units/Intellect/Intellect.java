package Units.Intellect;

import Units.Unit;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Intellect extends Unit {
    int magic_mana;

    public Intellect(String name, int maxHp, int[] damage, int speed, int attack, int defence, boolean alive, int magic_mana, int x, int y) {
        super(name, maxHp, damage, speed, attack, defence, alive, x, y);
        this.magic_mana = magic_mana;
    }

    public int getMagic_mana() {
        return magic_mana;
    }

    public void setMagic_mana(int magic_mana) {
        this.magic_mana = magic_mana;
    }

    @Override
    public void step(ArrayList<Unit> enimies, ArrayList<Unit> friends) {

        if (alive) {
            if (isInjured(friends) && this.magic_mana > 0){
                Unit target = findInjured(friends);
                this.to_heal(target, damage[0]);
                this.magic_mana -= 1;
            }
        }
    }

    public boolean isInjured(ArrayList<Unit> friends){
        for (int i = 0; i < friends.size(); i++) {
            if(friends.get(i).isAlive() && friends.get(i).getHp() < friends.get(i).getMaxHp()){
                return true;
            }
        }
        return false;
    }
    protected Unit findInjured(ArrayList<Unit> friends) {

        String[] className = new String[]{"Warrior", "Shooter", "Intellect", "Servant"};

        for (int j = 0; j < className.length; j++) {
            ArrayList<Unit> injured = new ArrayList<Unit>();

            for (int i = 0; i < friends.size(); i++) {
                // Массив раненных определённого className класса
                if (friends.get(i).isAlive() && friends.get(i).getClass().getName().contains(className[j])) {

                    if (friends.get(i).getHp() < friends.get(i).getMaxHp()) {
                        injured.add(friends.get(i));
                    }
                }
            }

            if(injured.size() > 0){
                int minHp_index = 0;// ищем индекс самого слабого по Hp
                for (int k = 0; k < injured.size() ; k++) {
                    if (injured.get(k).getHp() < injured.get(minHp_index).getHp()) {
                        minHp_index = k;
                    }
                }
                return injured.get(minHp_index);

            }
        }

        return null;
    }
}
