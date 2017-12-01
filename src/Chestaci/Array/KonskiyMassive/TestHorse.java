package Chestaci.Array.KonskiyMassive;

import java.util.ArrayList;

public class TestHorse {
    public static void main(String[] args) {
//        HorseField hf = new HorseField(5);
//        hf.printArr();
        Horse h = new Horse(0,2, 7);

        System.out.println(h.toString());
        System.out.println();
        h.printArr();
        System.out.println();
        h.forward();
        System.out.println();
        ArrayList ccc = h.getVar();
        for(int i = 0; i < ccc.size(); i++){
            System.out.println(ccc.get(i));
        }
    }
}
