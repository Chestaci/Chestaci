package Chestaci.Array.KonskiyMassive.KM1;

public class TestHorse {
    public static void main(String[] args) {
//        HorseField hf = new HorseField(7);
//        hf.printArr();
        Horse h = new Horse(5,5,10);
     //   h.printArr();

        for(int i = ((h.getSize()*h.getSize()) - 1); i > 0; i--) {

            h.forward();
        }
        h.printArr();

    }
}
