package Chestaci.Array.KonskiyMassive;

public class VarStepHorse {
    private int x ;
    private int y;
    private int meter;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public VarStepHorse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "VarStepHorse{" + "x=" + x + ", y=" + y + '}';
    }
}
