package Units.Servant;

import Units.Unit;

import java.util.ArrayList;

public class Pesant extends Servant{

    int delivery;

    public Pesant(String name, int x, int y) {
        super(name,
                1,
                new int[] {1,1},
                3,
                1,
                1,
                true,
                x, y);
        this.delivery = 1;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public void to_delivery(){};

    @Override
    public void step(ArrayList<Unit> enemies, ArrayList<Unit> friends){
        System.out.println("Yes, my lord!");
    }
    @Override
    public void getInfo() {
        System.out.println(String.format("Name: %s  Hp: %d Speed: %s  Type: %s Delivery: %d ",
                NAME, (int)(this.hp), this.getSpeed(), this.getClass().getSimpleName(), this.delivery));
    }

}
