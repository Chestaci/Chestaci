package Thinking_in_Java.Chapter_13;

import java.util.Formatter;

public class Ex4 {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}

class Receipt{
    private double total = 0;
    private String b1 = "15";
    private String b2 = "5";
    private String b3 = "10";

    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-" + b1 + "s %" + b2 + "s %" + b3 + "s\n", "Item", "Qty", "Price");
        f.format("%-" + b1 + "s %" + b2 + "s %" + b3 + "s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price){
        f.format("%-" + b1 + ".15s %" + b2 + "d %" + b3 + ".2f\n", name, qty, price);
        total += price;
    }
    public void printTotal(){
        f.format("%-" + b1 + "s %" + b2 + "s %" + b3 + ".2f\n", "Tax", "", total*0.06);
        f.format("%-" + b1 + "s %" + b2 + "s %" + b3 + "s\n", "", "", "-----");
        f.format("%-" + b1 + "s %" + b2 + "s %" + b3 + ".2f\n", "Total", "", total*1.06);
    }
}