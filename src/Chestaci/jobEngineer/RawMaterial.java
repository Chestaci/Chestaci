package Chestaci.jobEngineer;

public class RawMaterial {

    private String name;
    private double tu;
    private double rfa;

    public RawMaterial(String name, double tu, double rfa) {
        this.name = name;
        this.tu = tu;
        this.rfa = rfa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTu() {
        return tu;
    }

    public void setTu(double tu) {
        this.tu = tu;
    }

    public double getRfa() {
        return rfa;
    }

    public void setRfa(double rfa) {
        this.rfa = rfa;
    }

    public double calcDif() {
        double dif = rfa - tu;
        return dif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RawMaterial)) return false;

        RawMaterial that = (RawMaterial) o;

        if (Double.compare(that.tu, tu) != 0) return false;
        if (Double.compare(that.rfa, rfa) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(tu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rfa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
