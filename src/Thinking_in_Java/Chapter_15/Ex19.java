package Thinking_in_Java.Chapter_15;

import java.util.*;
import net.mindview.util.*;

public class Ex19 {
}

class Product {
    private final int id;
    private String description;
    private double price;
    public Product(int IDnumber, String descr, double price){
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }
    public void priceChange(double change) {
        price += change;
    }
    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(47);
                public Product next() {
                    return new Product(rand.nextInt(1000), "Test",
                            Math.round(rand.nextDouble() * 1000.0) + 0.99);
                }
            };
}

class Container extends ArrayList<Product> {
    public Container(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}

class Shelf extends ArrayList<Container> {
    public Shelf(int nContainers, int nProducts) {
        for(int i = 0; i < nContainers; i++)
            add(new Container(nProducts));
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nContainers, int nProducts) {
        for(int i = 0; i < nShelves; i++)
            add(new Shelf(nContainers, nProducts));
    }
}



class Office {}

class ContainerShip extends ArrayList<Aisle> {

    private Office office = new Office();
    public ContainerShip(int nAisles, int nShelves, int nContainers, int nProducts) {
        for(int i = 0; i < nAisles; i++)
            add(new Aisle(nShelves, nContainers, nProducts));
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Aisle a : this)
            for(Shelf s : a)
                for(Container c : s)
                for(Product p : c) {
                    result.append(p);
                    result.append("\n");
                }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(new ContainerShip(14, 5, 3, 10));
    }
}
