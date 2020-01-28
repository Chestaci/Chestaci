package Thinking_in_Java.Chapter_18;

import java.io.*;

import static net.mindview.util.Print.print;

public class Blips {
    // Throw exceptions to console:
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        print("Constructing objects:");
        Blip1 b1 = new Blip1();
        E28_BlipCheck b2 = new E28_BlipCheck();
        ObjectOutputStream o =
                new ObjectOutputStream(
                        new FileOutputStream("Blips.out"));
        print("Saving objects:");
        o.writeObject(b1);
        o.writeObject(b2);
        o.close();
// Now get them back:
        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("Blips.out"));
        print("Recovering b1:");
        b1 = (Blip1)in.readObject();
// OOPS! Throws an exception:
        print("Recovering b2:");
        b2 = (E28_BlipCheck)in.readObject();
    }
}
