package Units;

import java.util.ArrayList;

public interface UnitInrfce {

    void step(ArrayList<Unit> enimies, ArrayList<Unit> friends);

    void getInfo();
}
