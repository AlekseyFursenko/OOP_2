package Units;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public float getDist(Position pos) {
        return (float) Math.sqrt(Math.pow((this.x-pos.getX()), 2) + Math.pow((this.y - pos.getY()), 2));
    }
}
