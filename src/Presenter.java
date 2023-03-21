import Units.Unit;

import java.util.ArrayList;

public class Presenter {
    Model bands;
    ConsoleView view;

    public Presenter(ConsoleView view) {
        bands = new Model();
        this.view = view;
    }

    public void step(){
        for (int i = 0; i < Main.BAND_SIZE; i++) {
            Main.darkBand.get(i).step(Main.whiteBand, Main.darkBand);
            Main.whiteBand.get(i).step(Main.darkBand, Main.whiteBand);
        }
        ConsoleView.view();
    };


}
