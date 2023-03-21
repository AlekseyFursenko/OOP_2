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

public class Model {

    public static void whiteBand(){
        Main.whiteBand = new ArrayList<>();
        for (int i = 1; i < Main.BAND_SIZE + 1; i++) {
            int n = new Random().nextInt(40)/10;

            switch (n){
                case 0: Main.whiteBand.add(new Pesant(getName(), 1, i));
                    break;
                case 1: Main.whiteBand.add(new Monk(getName(), 1, i));
                    break;
                case 2: Main.whiteBand.add(new Archer(getName(),1, i));
                    break;
                case 3: Main.whiteBand.add(new Spearman(getName(), 1, i));
                    break;
            }
        }
    }

    public static void darkBand() {
        Main.darkBand = new ArrayList<>();
        for (int i = 1; i < Main.BAND_SIZE + 1; i++) {
            int n = new Random().nextInt(40) / 10;

            switch (n) {
                case 0:
                    Main.darkBand.add(new Pesant(getName(), 10, i));
                    break;
                case 1:
                    Main.darkBand.add(new Warlock(getName(), 10, i));
                    break;
                case 2:
                    Main.darkBand.add(new XBowman(getName(), 10, i));
                    break;
                case 3:
                    Main.darkBand.add(new Robber(getName(), 10, i));
                    break;
            }
        }
    }
    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}
