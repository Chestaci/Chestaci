package Thinking_in_Java.Chapter_18;

import java.io.*;

public class Ex27 implements Serializable {
    Ex27_1 a = new Ex27_1();

    @Override
    public String toString() {
        return "Ex27{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Ex27 b = new Ex27();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ex27.out"));
        out.writeObject("Hello!\n");
        out.writeObject(b);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ex27.out"));
        String s = (String) in.readObject();
        Ex27 b2 = (Ex27) in.readObject();
        System.out.println(s + "b2 = " + b2);

    }
}

class Ex27_1 implements Serializable{
    @Override
    public String toString() {
        return "Ex27_1{}";
    }
}
