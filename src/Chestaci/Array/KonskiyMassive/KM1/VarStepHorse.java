package Chestaci.Array.KonskiyMassive.KM1;

public class VarStepHorse{
    private int x ;
    private int y;
    private int meter;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMeter() {
        return meter;
    }

    public VarStepHorse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public VarStepHorse(int x, int y, int meter) {
        this.x = x;
        this.y = y;
        this.meter = meter;
    }

    @Override
    public String toString() {
        return "VarStepHorse{" + "x =" + x + ", y =" + y + " , meter =" + meter + '}';
    }
}
