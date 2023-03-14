import Units.Intellect.Monk;
import Units.Intellect.Warlock;
import Units.Names;
import Units.Servant.Pesant;
import Units.Shooter.Archer;
import Units.Shooter.XBowman;
import Units.Unit;
import Units.Warrior.Robber;
import Units.Warrior.Spearman;
import Units.Warrior.Warrior;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> whiteBand = new ArrayList<>();
        ArrayList<Unit> darkBand = new ArrayList<>();
        ArrayList<Unit> stackBand = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(40)/10;

            switch (n){
                case 0: whiteBand.add(new Pesant(getName()));
                        break;
                case 1: whiteBand.add(new Monk(getName()));
                    break;
                case 2: whiteBand.add(new Archer(getName()));
                    break;
                case 3: whiteBand.add(new Spearman(getName()));
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(40)/10;

            switch (n){
                case 0: darkBand.add(new Pesant(getName()));
                    break;
                case 1: darkBand.add(new Warlock(getName()));
                    break;
                case 2: darkBand.add(new XBowman(getName()));
                    break;
                case 3: darkBand.add(new Robber(getName()));
                    break;
            }
        }

        stackBand.addAll(whiteBand);
        stackBand.addAll(darkBand);
        // sort by speed
        stackBand.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return (o2.getSpeed() - o1.getSpeed());
            }
        });

        stackBand.forEach(unit -> unit.getInfo());
    }


    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}