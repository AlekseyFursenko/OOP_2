import Units.Intellect.Monk;
import Units.Intellect.Warlock;
import Units.Names;
import Units.Servant.Pesant;
import Units.Shooter.Archer;
import Units.Shooter.XBowman;
import Units.Unit;
import Units.Warrior.Robber;
import Units.Warrior.Spearman;

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
                case 0: whiteBand.add(new Pesant(getName(), 0, i));
                        break;
                case 1: whiteBand.add(new Monk(getName(), 0, i));
                    break;
                case 2: whiteBand.add(new Archer(getName(),0, i));
                    break;
                case 3: whiteBand.add(new Spearman(getName(), 0, i));
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(40)/10;

            switch (n){
                case 0: darkBand.add(new Pesant(getName(), 9, i));
                    break;
                case 1: darkBand.add(new Warlock(getName(), 9, i));
                    break;
                case 2: darkBand.add(new XBowman(getName(), 9, i));
                    break;
                case 3: darkBand.add(new Robber(getName(), 9, i));
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

        //stackBand.forEach(unit -> unit.getInfo());
        System.out.println("\nSorted");
        for (Unit unit : stackBand) System.out.println(unit.toString() + " " + unit.getPosition());

        System.out.println("\nLet start the War!:");
        System.out.println("\nWhite turn!");
        for (Unit unit : whiteBand) {
            unit.step(darkBand, whiteBand);
        }
        System.out.println("\nDark turn!");
        for (Unit unit : darkBand) {
            unit.step(whiteBand, darkBand);
        }
    }


    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}