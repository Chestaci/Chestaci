package Thinking_in_Java.Chapter_11;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));
        gerbils.add(new Gerbil(5));
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}

class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println(gerbilNumber + " " + "Hi!");
    }

}