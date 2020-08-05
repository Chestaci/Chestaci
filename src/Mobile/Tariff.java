package Mobile;

import java.util.Collections;
import java.util.HashSet;

public class Tariff {
    private String name;
    private double cost;
    private HashSet<Option> options;

//    public Tariff(String name, double cost, int optionGroupID) {
//        this.name = name;
//        this.cost = cost;
//        this.optionGroupID = optionGroupID;
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

    public HashSet<Option> getOptions() {
        return options;
    }

    public void setOptions(HashSet<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Tariff " + name;
    }

    //    private String name;
//    private int cost;
//    private HashSet <Option> option;

//    public Tariff(String name, int cost, Option ... options) {
//        this.name = name;
//        this.cost = cost;
//        HashSet<Option> tempOption = new HashSet <Option>();
//        Collections.addAll(tempOption, options);
//        this.option = tempOption;
//    }
//
//    @Override
//    public String toString() {
//        return "Tariff{" +
//                "name='" + name + '\'' +
//                ", cost=" + cost +
//                ", option=" + option +
//                '}';
//    }

//    public static void main(String[] args) {
//        Option one = new Option("1", 100, 50);
//        Option two = new Option("2", 200, 50);
//
//        Tariff tariff1 = new Tariff("Тариф 1",100, one, two);
//        System.out.println(tariff1.toString());
//    }
}
