package Mobile;

public class Option {
    private String name;
    private double cost;
    private double connectionPrice;

//    public Option(String name, double cost, double connectionPrice) {
//        this.name = name;
//        this.cost = cost;
//        this.connectionPrice = connectionPrice;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getConnectionPrice() {
        return connectionPrice;
    }

    public void setConnectionPrice(double connectionPrice) {
        this.connectionPrice = connectionPrice;
    }

    @Override
    public String toString() {
        return "Option " + name;
    }
}
