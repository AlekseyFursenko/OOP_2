package Units.Servant;

public class Pesant extends Servant{

    int delivery;

    public Pesant() {
        super("Pesant",
                1,
                new int[] {1,1},
                3,
                1,
                1,
                true);
        this.delivery = 1;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public void to_delivery(){};
}
